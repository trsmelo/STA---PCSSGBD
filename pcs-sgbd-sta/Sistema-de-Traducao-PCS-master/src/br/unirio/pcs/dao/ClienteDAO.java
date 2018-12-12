package br.unirio.pcs.dao;

import br.unirio.pcs.suta.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiago
 */
public class ClienteDAO {

    private static String dbURL = "jdbc:postgresql://localhost:5432/STA";
    private static Connection conn = null;

    /**
     * Abre conexão JDBC com o Banco de Dados
     *
     * @return
     */
    private static void abrirConexao() {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            conn = DriverManager.getConnection(dbURL, "postgres", "admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Fecha a conexão JDBC
     *
     */
    private static void fecharConexao() throws Exception {
        conn.close();
    }

    /**
     * Metodo que faz uma consulta por um cliente especifico pelo nome
     *
     * @param cliente
     * @return
     * @throws Exception
     */
    public List<Cliente> consultarCliente(String nome) throws Exception {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> listaCliente = new ArrayList<Cliente>();

        Cliente cliente = null;

        try {
            abrirConexao();
            String sql = "select * from cliente where nome_cliente = ? ";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setCpf(rs.getString("cpf_cliente"));
                cliente.setNome(rs.getString("nome_cliente"));
                //cliente.setEmail(rs.getString("email"));                
                cliente.setTelefone(rs.getString("telefone_cliente"));
                //cliente.setNomeUsuario(rs.getString("NomeUsuario"));
                cliente.setSobreNome(rs.getString("sobrenome_cliente"));
                cliente.setSenha(rs.getString("senha_cliente"));
                listaCliente.add(cliente);
            }
        } finally {
            stmt.close();
            rs.close();
        }
        return listaCliente;
    }

    /**
     * Metodo que realizar o login no sistema
     *
     * @param cpf
     * @param senha
     * @return
     * @throws Exception
     */
    public boolean realizarLogin(String cpf, String senha) throws Exception {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        //List<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            abrirConexao();
            String sql = "select cpf_cliente,senha_cliente from cliente where cpf_cliente = ? and senha_cliente = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {

                return true;
            } else {
                return false;
            }
        } finally {
            stmt.close();
            rs.close();
        }
    }

    /**
     * Método que conta quantos clientes estão cadastrados
     *
     * @return
     * @throws Exception
     */
    public int contarCliente() throws Exception {
        int count = 0;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //List<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            abrirConexao();
            String sql = "select count(*) from cliente";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {

                count += rs.getInt(1);
            }
            return count;
        } finally {
            stmt.close();
            rs.close();
        }
    }

    /**
     * Metodo que insere um cliente no Banco de dados
     *
     * @param nome
     * @param cpf
     * @param sobreNome
     * @param telefone
     * @param senha
     */
    public void inserirCliente(int id, String nome, String senha, String telefone, String sobreNome, String cpf) throws Exception {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            abrirConexao();
            String sql = "INSERT INTO cliente " + "(id,nome_cliente,senha_cliente,telefone_cliente,sobrenome_cliente,cpf_cliente) VALUES " + "(?,?,?,?,?,?) ";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, nome);
            stmt.setString(3, senha);
            stmt.setString(4, telefone);
            stmt.setString(5, sobreNome);
            stmt.setString(6, cpf);
            stmt.execute();

        } finally {
            stmt.close();
            rs.close();
        }

    }
    /**
     *
     * @param senha
     * @param senhaAntiga
     */
    public void atualizaSenha(String senha,String cpf) throws Exception {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int affectedrows = 0;
        
        try {
            abrirConexao();
            String sql = "UPDATE cliente SET senha_cliente = ? WHERE cpf_cliente = ?";
            
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, senha);
            stmt.setString(2, cpf); 
            affectedrows = stmt.executeUpdate();
            
            System.out.println(affectedrows);
            
        } finally {
            stmt.close();
        }
    }
    /**
     * 
     * Atualiza o telefone do cliente
     * 
     * @param senha
     * @param cpf
     * @throws Exception 
     */
    public void atualizaTelefone(String telefone,String cpf) throws Exception {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int affectedrows = 0;
        
        try {
            abrirConexao();
            String sql = "UPDATE cliente SET telefone_cliente = ? WHERE cpf_cliente = ?";
            
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, telefone);
            stmt.setString(2, cpf);
            affectedrows = stmt.executeUpdate();
            
            System.out.println(affectedrows);
            
        } finally {
            stmt.close();
        }
    }
//    public static void main(String[] args) throws Exception {
//
//        ClienteDAO dao = new ClienteDAO();
//        //System.out.println(dao.consultarCliente("tiago"));      
//        //System.out.println(dao.realizarLogin("3879283821", "123"));
//        //dao.inserirCliente(3,"nayara", "123", "1234", "melo", "3456322");
//        //System.out.println(dao.contarCliente());
//        //dao.atualizaSenha("12345","123412");
//        dao.atualizaTelefone("986853062","3879283821");
//
//    }

}

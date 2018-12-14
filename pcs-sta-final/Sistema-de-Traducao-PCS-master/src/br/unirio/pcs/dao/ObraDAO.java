package br.unirio.pcs.dao;

import br.unirio.pcs.suta.Cliente;
import br.unirio.pcs.suta.Obra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiago
 */
public class ObraDAO {

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
     * Faz uma consulta por um cliente especifico
     * 
     * @param nome
     * @return
     * @throws Exception 
     */
    public List<Obra> consultarObraPeloNome(String nome) throws Exception {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Obra> listaObra = new ArrayList<Obra>();

        Obra obra = null;

        try {
            abrirConexao();
            String sql = "select * from obra where nome_obra = ? ";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            while (rs.next()) {
                obra = new Obra();
                obra.setNome(rs.getString("nome_obra"));
                obra.setAutor(rs.getString("autor_obra"));
                obra.setSinopse(rs.getString("sinopse"));                
                obra.setNota(rs.getInt("nota"));
                obra.setDesconto(rs.getFloat("desconto"));
                obra.setPreco(rs.getDouble("preco"));
                listaObra.add(obra);
            }
        } finally {
            stmt.close();
            rs.close();
        }
        return listaObra;
    }
    /**
     * Lista todas as obras catalogadas
     * 
     * @return
     * @throws Exception 
     */
    public List<Obra> listarObras() throws Exception {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Obra> listaObra = new ArrayList<Obra>();

        Obra obra = null;

        try {
            abrirConexao();
            String sql = "select * from obra";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                obra = new Obra();
                obra.setNome(rs.getString("nome_obra"));
                obra.setAutor(rs.getString("autor_obra"));
                obra.setSinopse(rs.getString("sinopse"));                
                obra.setNota(rs.getInt("nota"));
                obra.setDesconto(rs.getFloat("desconto"));
                obra.setPreco(rs.getDouble("preco"));
                listaObra.add(obra);
            }
        } finally {
            stmt.close();
            rs.close();
        }
        return listaObra;
    }
    /**
     * 
     * Método que insere uma Obra no Banco
     * 
     * @param id
     * @param nome
     * @param senha
     * @param telefone
     * @param sobreNome
     * @param cpf
     * @throws Exception 
     */
    public void inserirObra(int id, String autor, String sinopse, int nota, float desconto, double preco,String nome_obra) throws Exception {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            abrirConexao();
            String sql = "INSERT INTO obra " + "(id,autor,sinopse,nota,desconto,preco,nome_obra) VALUES " + "(?,?,?,?,?,?,?) ";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, autor);
            stmt.setString(3, sinopse);
            stmt.setInt(4, nota);
            stmt.setFloat(5, desconto);
            stmt.setDouble(6, preco);
            stmt.setString(6, nome_obra);
            stmt.execute();

        } finally {
            stmt.close();
            rs.close();
        }

    }
//    public static void main(String[] args) throws Exception{
//        
//        ObraDAO dao = new ObraDAO();
//        List<Obra> obra = dao.consultarObraPeloNome("Harry Potter");
//        
//        for (Obra ob : obra){
//            
//            System.out.println(ob.getSinopse());
//        }
//    }
    
}

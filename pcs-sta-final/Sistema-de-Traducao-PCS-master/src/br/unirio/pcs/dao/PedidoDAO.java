package br.unirio.pcs.dao;

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
public class PedidoDAO {

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
     * Insere pedido no banco
     * 
     * @param id
     * @param ordem_compra
     * @param nome_cliente
     * @throws Exception 
     */
    public void inserirPedido(double ordem_compra,String nome_cliente,int id) throws Exception {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            abrirConexao();
            String sql = "INSERT INTO pedido " + "(ordem_compra,nome_cliente,id) VALUES " + "(?,?,?) ";
            stmt = conn.prepareStatement(sql);
            stmt.setDouble(1, ordem_compra);
            stmt.setString(2, nome_cliente);
            stmt.setInt(3, id); 
            stmt.executeQuery();

        } finally {
            stmt.close();
            rs.close();
        }

    }
    public static void main(String[] args) throws Exception{
        PedidoDAO dao = new PedidoDAO();
         
        dao.inserirPedido(1000,"tiago",1);
    }
}

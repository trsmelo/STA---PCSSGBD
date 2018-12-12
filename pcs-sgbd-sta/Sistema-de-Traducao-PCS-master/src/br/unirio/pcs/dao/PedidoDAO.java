package br.unirio.pcs.dao;

import java.sql.Connection;
import java.sql.DriverManager;

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
    
}

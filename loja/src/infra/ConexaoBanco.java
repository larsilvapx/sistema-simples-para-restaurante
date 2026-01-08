package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static final String URL =
            "jdbc:mysql://localhost:3306/restaurante_db";

    private static final String USER = "root";
    private static final String PASSWORD = "sua_senha";

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco" + e);
        }
    }

}
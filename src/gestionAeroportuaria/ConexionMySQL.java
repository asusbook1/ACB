package gestionAeroportuaria;
import java.sql.*;

public class ConexionMySQL {
    static String url = "jdbc:mysql://82.197.82.62:3306/u984447967_op2024b";
    static String user = "u984447967_unipaz";
    static String pass = "estudiantesPoo2024B.*";
    
    public static Connection conectar(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException e) {
            System.out.println("No das con el driver de MySQL");
        } catch (SQLException e) {
            System.out.println("Error.");
        }
        return con;
    }
}
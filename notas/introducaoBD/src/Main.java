import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = " jdbc: postgressql://localhost: 5432/loja";
        try { //tenta se conectar ao banco de dados
            Connection conn = DriverManager.getConnection(
                    url, "Postgres", "fatec123*");
        }
        catch (SQLException) {// caso de erro desvia para cá
            System.out.println("erro ao conectar com o banco " + e.getMessage());

        }
    }
}
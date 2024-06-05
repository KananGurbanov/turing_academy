package az.edu.turing.module02.lesson4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD)) {

            Statement statement = connection.createStatement();

            int i = statement.executeUpdate("CREATE TABLE if not exists cars (" +
                    " id bigint primary key ," +
                    "model varchar(255) not null )");

            if(i > 1){
                System.out.println("Table is created");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

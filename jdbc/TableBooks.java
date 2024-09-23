package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class TableBooks {
    public static void main(String[] args) {
            String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=ak_practice;encrypt=true;trustServerCertificate=true";
            String user = "akshaya";
            String password = "akshaya@420";

            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the database!");
                Statement statement= connection.createStatement();
                String createtable= "CREATE TABLE books ("
                        + "id INT PRIMARY KEY , "
                        + "title VARCHAR(25), "
                        + "author VARCHAR(25))";
                statement.execute(createtable);
                System.out.println("Create table executed successfully!");
            } catch (SQLException e) {
                System.out.println("There is an exception in the given SQL query");
                e.printStackTrace();
            }
        }
    }


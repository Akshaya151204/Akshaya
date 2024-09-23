package jdbc;
import java.sql.*;
public class CountRecord {
        public static void main(String[] args) {
            String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=ak_practice;encrypt=true;trustServerCertificate=true";
            String user = "akshaya";
            String password = "akshaya@420";
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                String countRecord = "SELECT COUNT(*) AS total FROM books";
                PreparedStatement preparedStatement=connection.prepareStatement(countRecord);
                ResultSet resultSet = statement.executeQuery(countRecord);

                if (resultSet.next()) {
                    int count = resultSet.getInt("total");
                    System.out.println("Total number of records in books table: " + count);
                }

            } catch (SQLException e) {
                System.out.println("There is an exception in the given SQL query");
                e.printStackTrace();
            }
        }
    }






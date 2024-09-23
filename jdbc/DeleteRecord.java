package jdbc;
import java.sql.*;
import java.util.Scanner;


public class DeleteRecord {


        public static void main(String[] args) {
            String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=ak_practice;encrypt=true;trustServerCertificate=true";
            String user = "akshaya";
            String password = "akshaya@420";
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the ID of the book to delete: ");
                int bookId = scanner.nextInt();

                String deleteSQL = "DELETE FROM books WHERE id = ?";

                try (Connection connection = DriverManager.getConnection(url, user, password);
                     PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {

                    preparedStatement.setInt(1, bookId);


                    int rowsAffected = preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println("There is an exception in the given SQL query");
                e.printStackTrace();
            }
        }
    }





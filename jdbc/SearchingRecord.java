package jdbc;
import java.sql.*;
import java.util.Scanner;

public class SearchingRecord {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=ak_practice;encrypt=true;trustServerCertificate=true";
        String user = "akshaya";
        String password = "akshaya@420";
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a book title (or part of it): ");
                String inputTitle = scanner.nextLine();


                String query = "SELECT * FROM books WHERE title LIKE ?";


                try (Connection connection = DriverManager.getConnection(url, user, password);
                     PreparedStatement preparedStatement = connection.prepareStatement(query)) {


                    preparedStatement.setString(1, inputTitle );


                    ResultSet resultSet = preparedStatement.executeQuery();



                    if (resultSet.next()) {

                        int id = resultSet.getInt("id");
                        String title = resultSet.getString("title");
                        String author = resultSet.getString("author");
                        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
                    }else {
                        System.out.println("Match not found");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

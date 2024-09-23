package jdbc;
import java.sql.*;
import java.util.Scanner;

public class FilterRecords {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=ak_practice;encrypt=true;trustServerCertificate=true";
        String user = "akshaya";
        String password = "akshaya@420";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the author's name: ");
        String authorName = scanner.nextLine();
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM books WHERE author = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, authorName);


                    ResultSet resultSet = preparedStatement.executeQuery();


                    System.out.printf("Book ID", "Title", "Author");

                    while (resultSet.next()) {
                        int bookId = resultSet.getInt("id");
                        String title = resultSet.getString("title");
                        String author = resultSet.getString("author");


                        System.out.printf("ID: " + bookId + ", Title: " + title + ", Author: " + author);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }






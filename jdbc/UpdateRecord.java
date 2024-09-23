package jdbc;
import java.sql.*;
import java.util.Scanner;


public class UpdateRecord {


    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=ak_practice;encrypt=true;trustServerCertificate=true";
        String user = "akshaya";
        String password = "akshaya@420";
        Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the ID of the book to update: ");
                int bookId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter the new title for the book: ");
                String newTitle = scanner.nextLine();

                String updateSQL = "UPDATE books SET title = ? WHERE id = ?";

                try (Connection conn = DriverManager.getConnection(url, user, password);
                     PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

                    pstmt.setString(1, newTitle);
                    pstmt.setInt(2, bookId);

                    int rowsAffected = pstmt.executeUpdate();


                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Error updating the book title.");
                }
            }
        }




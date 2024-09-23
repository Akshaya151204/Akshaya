package jdbc;
import java.sql.*;
public class RetrieveRecord {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=ak_practice;encrypt=true;trustServerCertificate=true";
        String user = "akshaya";
        String password = "akshaya@420";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String selectquery = "SELECT * FROM books";
            PreparedStatement preparedStatement=connection.prepareStatement(selectquery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                System.out.println("id: "+id+"title: "+title+"author: "+ author);
            }

        } catch (SQLException e) {
            System.out.println("There is an exception in the given SQL query");
            e.printStackTrace();
        }
    }
}


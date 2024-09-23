package jdbc;
import java.sql.*;
public class InsertIntoBooks {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=ak_practice;encrypt=true;trustServerCertificate=true";
        String user = "akshaya";
        String password = "akshaya@420";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String insert = "INSERT INTO books values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setInt(1, 10031);
            preparedStatement.setString(2, "Rise successfull people");
            preparedStatement.setString(3, "Esther");
            System.out.println("Values inserted successfully");
            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            System.out.println("There is an exception in the given SQL query");
            e.printStackTrace();
        }
    }
}


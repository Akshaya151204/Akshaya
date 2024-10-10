package src.JDBC2;
import java.sql.*;
public class JDBCInsertFields
{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=ak_practice;encrypt=true;trustServerCertificate=true";
        String user = "akshaya";
        String password = "akshaya@420";
        String create = "Create table employee4 (Employee_ID varchar(50) not NULL," +
                " First_Name varchar(255)not NULL, Last_Name varchar(255)not NULL," +
                " Middle_Name varchar(255), Date_of_Birth Date, Gender varchar(255)," +
                " Email_Address varchar(255), Phone_Number varchar(255), " +
                "House_Address varchar(255), Job varchar(255), Department varchar(255)," +
                " Manager_ID varchar(50) not NULL, Date_of_Joining date, Employment_Status varchar(255)," +
                " Salary varchar(50) not NULL, Work_Location varchar(255), PAN_Number varchar(50) not NULL, " +
                "Aadhaar_Number varchar(50) not NULL, Bank_Account_Details varchar(255)," +
                " Employment_Eligibility_verification varchar(255), Background_Check_Status varchar(255), " +
                "Additional_Information varchar(255), Emergency_Contact varchar(255), Skills varchar(255)," +
                " Education varchar(255), Certifications varchar(255), Performance varchar(255))";
        String insert = "insert into employee4 values('Cs400','A','Amuthan','Akshaya','2004-12-15','Female','akshu19721@gmail.com','6383909012','Kanchipuram'," +
                "'Employee','Application','CI3005','2024-07-15','FullTime','50000','Medavakkam','FEW45678','AK8898989899','123456AK','Verification Completed'," +
                "'Verification done','Employee','9382827282','Painting','BCA','NPTEL','Good')";
        String insert1 = "insert into employee4 values('Cs401','S','Babu','Anushka','2005-2-5','Female','anu@gmail.com','9443485088','Kanchipuram'," +
                "'manager','Front-End','CI3006','2024-09-5','PartTime','500000','Chennai','FEW456789','AAK8898989899','11123456AK','Verification Completed'," +
                "'Verification done','Manager','9952547023','Drawing','BBA','NPTEL','Excellent')";
        String insert2 = "insert into employee4 values('Cs4022','S','Mohan','Shruthi','2005-3-11','Female','shruthi@gmail.com','8825720284','Madurai'," +
                "'Employee','Back-End','CI30060','2024-10-6','PartTime','5000','Medavakkam','FEW4567890','AAK88989898990','11123456AKK','Verification Completed'," +
                "'Verification done','Employee','9952547023','Singing','B.com','NPTEL','Excellent')";


        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement =connection.createStatement();
            PreparedStatement preparedStatement=connection.prepareStatement(insert2);
            preparedStatement.executeUpdate();
            System.out.println("Table created Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

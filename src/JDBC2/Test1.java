package src.JDBC2;

public class Test1 {
    String firstName;
    String lastName;
    String phoneNumber;

    public Test1(String firstName, String lastName,String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber=phoneNumber;
    }
    public static void main(String[] args) {
        Test1 test = new Test1("Akshaya", "Amuthan","6728392839");
        System.out.println(test);
    }
}
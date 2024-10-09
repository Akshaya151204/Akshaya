package src.JDBC2;

public class Test3 {
    String firstName;
    String lastName;
    String phoneNumber;

    public Test3(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Test3 test = new Test3("Akshaya", "Amuthan", "6728392839");
        System.out.println(test);
    }
}

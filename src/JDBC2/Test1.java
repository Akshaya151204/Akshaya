package src.JDBC2;

public class Test1 {
    String firstName;
    String lastName;

    public Test1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static void main(String[] args) {
        Test1 test = new Test1("Akshaya", "Amuthan");
        System.out.println(test);
    }
}
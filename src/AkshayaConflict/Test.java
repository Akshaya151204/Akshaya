package src.AkshayaConflict;

public class Test {
    String firstName;
    String lastName;
    public Test(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public static void main(String[] args) {
        Test test=new Test("Akshaya","Amuthan");
        System.out.println(test);
    }
}

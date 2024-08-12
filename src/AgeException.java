package src;
public class AgeException extends Exception{
    AgeException(int Age){
        super("Invalid Age");
    }
    static void ValidAge(int Age) {
        System.out.println("Valid Age");
    }

    public static void main(String[] args) {

        int Age=120;
        try {
            if (Age < 0 || Age > 120) {
                throw new AgeException(Age);
            }
            ValidAge(Age);
        }catch (AgeException e){
            System.out.println(e.getMessage());
        }
    }
}

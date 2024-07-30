package ControlFlow;

public class Grade {
    public static void main(String[] args) {
        int mark = 489;
        if (mark <= 500 && mark > 400) {
            System.out.println("Grade A");
        } else if (mark <= 400 && mark > 300) {
            System.out.println("Grade B");
        } else if (mark <= 300 && mark > 200) {
            System.out.println("Grade C");
        } else {
            System.out.println("FAIL");
        }
    }
}

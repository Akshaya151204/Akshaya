package jdbc.Generics;

public class SumofGeneric <T extends Number>{
    public double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
        }
        public static void main(String[] args) {
        SumofGeneric<Integer> integerSum = new SumofGeneric<>();
            Integer int1 = 10;
            Integer int2 = 20;
            System.out.println("Sum of Integers: " + integerSum.sum(int1, int2));
            SumofGeneric<Double> doubleSum = new SumofGeneric<>();
            Double double1 = 10.5;
            Double double2 = 20.5;
            System.out.println("Sum of Doubles: " + doubleSum.sum(double1, double2));
        }
    }

import java.util.Arrays;

public class SwapElementsinArray {
    public static <T> void swap(T[] array, int number1, int number2) {
        T temp = array[number1];
        array[number1] = array[number2];
        array[number2] = temp;
    }

    public static void main(String[] args) {
        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("Before swap: " + Arrays.toString(strArray));


        SwapElementsinArray swapper = new SwapElementsinArray();
        swapper.swap(strArray, 0, 2);
        System.out.println("After swap: " + Arrays.toString(strArray));
    }
}

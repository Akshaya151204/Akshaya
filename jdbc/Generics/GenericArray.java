package jdbc.Generics;

import java.util.Arrays;

public class GenericArray {
    public <T> void printArray(T[] array) {
        if (array == null) {
            System.out.println("Array is null.");
            return;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        GenericArray genericArray = new GenericArray();
        Integer[] intArray = {1, 2, 3, 4, 5};
        genericArray.printArray(intArray);
    }
}




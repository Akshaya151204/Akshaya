package src;

import java.util.ArrayList;
import java.lang.String;
public class JoinArrayList {
    public static void main(String[] args) {
        ArrayList<String> array1=new ArrayList<>();
        ArrayList<String> array2=new ArrayList<>();
        array1.add("Cat");
        array1.add("Dog");
        array1.add("Tiger");
        array1.add("Lion");
        System.out.println("Elements in the first array:"+array1);
        array2.add("Monkey");
        array2.add("Goat");
        array2.add("zebra");
        array2.add("Gorilla");
        System.out.println("Elements in the second array:"+array2);
        ArrayList<String> array3=new ArrayList<>();
        array3.addAll(array1);
        array3.addAll(array2);
        System.out.println("Joining of both the arrays are:"+array3);
    }
}

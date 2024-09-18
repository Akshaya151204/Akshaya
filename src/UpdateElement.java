package src;

import java.util.ArrayList;

import java.lang.String;
import java.util.Scanner;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");
        fruits.add("Strawberry");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value that need to be replaced:");
        String replace=scanner.next();
        int update=fruits.indexOf(replace);
        System.out.println("Enter the Element that needs to be updated:");
        String update2=scanner.next();
        fruits.set(update,update2);
        System.out.println(fruits);
    }
}


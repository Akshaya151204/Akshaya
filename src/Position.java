package src;

import java.lang.String;
import java.util.ArrayList;
import java.util.LinkedList;

public class Position {
    public static void main(String[] args) {
        LinkedList<String> animals=new LinkedList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Cow");
        animals.add("Lion");
        animals.addFirst("MEOw");
        System.out.println(animals);

    }
}

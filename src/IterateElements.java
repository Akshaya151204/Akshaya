package src;

import java.util.ArrayList;
import java.lang.String;

public class IterateElements {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Dog");
        animals.add("Goat");
        animals.add("Cat");
        animals.add("Tiger");
        for (int i=0;i<animals.size();i++){
            System.out.println(animals.get(i));
        }

    }
}

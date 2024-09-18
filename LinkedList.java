import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedList {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits=new LinkedHashSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        System.out.println("Before Deleting:"+fruits);
        fruits.clear();
        System.out.println("After Deletion:"+fruits);
    }}

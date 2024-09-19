import java.util.HashSet;

public class Removeall {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Pineapple");
        set.add("Strawberry");
        System.out.println("Elements before the deletion:"+set);
        set.clear();
        System.out.println("Elements after the deletion:"+set);
    }
}

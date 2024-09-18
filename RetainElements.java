import java.util.HashSet;

public class RetainElements {
    public static void main(String[] args) {
        HashSet<String> set1=new HashSet<>();
        set1.add("Banana");
        set1.add("Pineapple");
        set1.add("Strawberry");
        set1.add("Papaya");
        HashSet<String> set2=new HashSet<>();
        set2.add("Orange");
        set2.add("Blueberry");
        set2.add("Pineapple");
        set2.add("Strawberry");
        set2.add("Banana");
        System.out.println("Set1 elements are:"+set1);
        System.out.println("Set2 elements are:"+set2);
        set1.retainAll(set2);
        System.out.println("Common in both the sets are:"+set1);
    }
}

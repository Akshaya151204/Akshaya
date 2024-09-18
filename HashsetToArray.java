import java.util.LinkedHashSet;

public class HashsetToArray {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        System.out.println("LinkedHarsh set:"+set);
        String [] array = set.toArray(new String[set.size()]);
        System.out.println("Array ELements are:");
        for (String elements:array){
            System.out.println(elements);
        }
    }
}

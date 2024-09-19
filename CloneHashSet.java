import java.util.ArrayList;
import java.util.HashSet;

public class CloneHashSet {
    public static void main(String[] args) {
        HashSet<Integer> integer=new HashSet<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);
        integer.add(4);
        integer.add(5);
        HashSet<Integer> cloneset=new HashSet<>(integer);
        System.out.println("Original set:"+integer);
        System.out.println("Clone set:"+cloneset);

    }
}

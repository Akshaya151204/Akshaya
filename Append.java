import java.util.HashSet;
import java.util.Scanner;

public class Append {
    public static void main(String[] args) {
        HashSet<Integer> integers=new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Scanner scanner=new Scanner(System.in);
        int element=scanner.nextInt();
        if (element>4){
            integers.add(element);
            System.out.println("Add the element:"+integers);
        }else {
            System.out.println("Do not add");
        }
    }
}

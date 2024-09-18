import java.util.HashMap;

public class RemoveMap {
    public static void main(String[] args) {
        HashMap<String,Integer> associateValueAndKey=new HashMap<>();
        associateValueAndKey.put("Banana",1);
        associateValueAndKey.put("Apple",2);
        associateValueAndKey.put("PineApple",3);
        associateValueAndKey.put("Orange",4);
        System.out.println("Before Deletion:"+associateValueAndKey);
        associateValueAndKey.clear();
        System.out.println("After Deletion:"+associateValueAndKey);
    }
    }


import java.util.TreeMap;

public class KeyTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeKeyMap=new TreeMap<>();
        treeKeyMap.put("Banana",1);
        treeKeyMap.put("Apple",2);
        treeKeyMap.put("Pineapple",3);
        treeKeyMap.put("Orange",4);
        System.out.println(treeKeyMap.keySet());

    }
    }

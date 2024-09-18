import java.util.TreeMap;

public class FirstandLastKey {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeKeyMap=new TreeMap<>();
        treeKeyMap.put(5,"Banana");
        treeKeyMap.put(2,"Apple");
        treeKeyMap.put(8,"Pineapple");
        treeKeyMap.put(1,"Orange");
        System.out.println("Treemap:"+treeKeyMap);
        Integer firstKey=treeKeyMap.firstKey();
        
        System.out.println("First Key: "+firstKey);
        Integer lastKey=treeKeyMap.lastKey();
       
        System.out.println("Last Key: "+lastKey);
    }
}

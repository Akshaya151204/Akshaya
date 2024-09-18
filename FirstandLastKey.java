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
        String firstValue=treeKeyMap.get(firstKey);
        System.out.println("First Key: "+firstKey+",Value: "+firstValue);
        Integer lastKey=treeKeyMap.lastKey();
        String lastValue=treeKeyMap.get(lastKey);
        System.out.println("Last Key: "+lastKey+",Value: "+lastValue);
    }
}

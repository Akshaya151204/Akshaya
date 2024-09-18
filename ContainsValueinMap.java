import java.util.HashMap;

public class ContainsValueinMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Banana",1);
        map.put("Apple",2);
        map.put("PineApple",3);
        map.put("Orange",4);
        System.out.println("HashMap:"+map);
        String mapcheck="Banana";
        if (map.containsKey(mapcheck)){
            System.out.println("Contain the value in the map:"+mapcheck);
        }else {
            System.out.println("Does not contain the value in the map"+mapcheck);
        }
    }
}

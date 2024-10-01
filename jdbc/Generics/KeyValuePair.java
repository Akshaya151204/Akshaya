package jdbc.Generics;

public class KeyValuePair<T,V> {
        T key;
        V value;
        public KeyValuePair(T key, V value){
            this.key=key;
            this.value=value;
        }
        @Override
        public String toString() {
            return "key:"+key+" value:"+value;
        }
        public static void main(String[] args) {
            KeyValuePair <String,Integer> genericClassPair1=new KeyValuePair(1,"one");
            System.out.println(genericClassPair1);
            KeyValuePair<Integer,String> genericClassPair2=new KeyValuePair(2,"two");
            System.out.println(genericClassPair2);
        }
    }


package src.ArrayTask;

import java.util.ArrayList;

public class CompareArray3 {
    public static void main(String[] args) {
        ArrayList<Integer> array1=new ArrayList<>();
        for (int i=0;i<10;i++){
            array1.add(i);
        }
        ArrayList<Integer> array2 =new ArrayList<>();
        for (int j = 0; j <10; j++){
            array2.add(j);
        }
        if (array1.equals(array2)==true){
            System.out.println("Both the arrays are equal");
        }else {
            System.out.println("Both the arrays are not equal");
        }
    }
    }
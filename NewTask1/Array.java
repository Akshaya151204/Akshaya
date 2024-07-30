package NewTask1;

public class Array {
    public static void main(String[] args) {
        int [] array1={350,450,250};
        int [] array2={850,750,450,250};
        int [] array3={450,250,350,471};
        int i,j,k;
        int count=0;
        for(i=0;i<array1.length;i++){
            for(j=0;j<array2.length;j++){
                for(k=0;k<array3.length;k++){
                    if(array1[i] == array2[j] && array2[j] == array3[k] && array3[k] == array1[i]){
                        count++;
                    }
                }
            }
        }
        System.out.println("Repeated numbers:"+count);
    }
}

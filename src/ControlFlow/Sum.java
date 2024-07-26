package ControlFlow;
public class Sum{
    public static void main(String[] args){
        int i;
        int num=25;
        int sum=0;
        for(i=1;i<=num;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of even numbers:"+sum);
    }


}

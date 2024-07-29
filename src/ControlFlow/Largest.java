package ControlFlow;

public class Largest {
    public static void main(String[] args) {
        int [] a={42,445547,78487,145142,78448};
        int i;
        int j;
        int t;
        for(i=0;i<=5;i++){
            for(j=0;j<5;j++){
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        System.out.println("Largest:"+a[4]);
        System.out.println("Smallest:"+a[0]);
    }
}

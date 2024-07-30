package ControlFlow;

public class Largest {
    public static void main(String[] args) {
        int[] a = {42,56, 445547, 78487, 145142, 78448};
        int i;
        int j;
        int t;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("Largest:" + a[a.length-1]);

        System.out.println("Smallest:" + a[0]);
    }
}


package ControlFlow;

public class Max {
    public static void main(String[] args) {
        int[] a = {42,56, 445547, 78487, 145142, 78448};
        int i;
        int j;
        int t;
        for (i = 0; i <= 5; i++) {
            for (j = 0; j < 5; j++) {
                if (a[i] < a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("1st Max:" + a[a.length-1]);
        System.out.println("2nd Max:" + a[a.length-2]);
        System.out.println("3rd Max:" + a[a.length-3]);
    }
}


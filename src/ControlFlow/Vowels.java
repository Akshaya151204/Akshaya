package ControlFlow;
public class Vowels {
    public static void main(String[] args) {
        String str[] = {"apple", "ball", "connection", "meeting"};
        int i, j;
        int count=0;
        for (i = 0; i < 3; i++) {

            for (j = 0; j < str[i].length(); j++) {
                if(str[i].charAt(j) == 'a' || str[i].charAt(j) == 'e' || str[i].charAt(j) == 'i' || str[i].charAt(j) == 'o' || str[i].charAt(j) == 'u')
                    count++;
            }
        }
        System.out.println(+count);
    }
}


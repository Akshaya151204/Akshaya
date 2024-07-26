package ControlFlow;

public class Vowels1 {
        public static void main(String[] args) {
            String str[] = {"apple", "ball", "connection", "meeting"};
            int i, j;
            for (i = 0; i < 4; i++) {
                int count = 0;
                for (j = 0; j < str[i].length(); j++) {
                    if(str[i].charAt(j) == 'a' || str[i].charAt(j) == 'e' || str[i].charAt(j) == 'i' || str[i].charAt(j) == 'o' || str[i].charAt(j) == 'u')
                    count++;
                }
            }
            System.out.println("Vowels count:" + str);
        }
    }


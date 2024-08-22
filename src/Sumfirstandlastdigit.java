package src;

import java.util.Scanner;

public class Sumfirstandlastdigit {
    public int firstandlast(int number) {
        int last;
        int sum=0;
        int numberTemp = number;
        if(number>0 && number<10){
            sum=number+number;
            return sum;
        }
        if (number < 0) {
            return -1;
        }

            while (number >= 10) {
                number /= 10;
            }
                last = numberTemp % 10;
                sum=number+last;
                return sum;

    }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int first = scanner.nextInt();
        Sumfirstandlastdigit sumfirstandlastdigit=new Sumfirstandlastdigit();
        System.out.println(sumfirstandlastdigit.firstandlast(first));
    }
}


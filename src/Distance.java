package src;


import java.util.Scanner;

public class Distance {
    char start, end;
    int Person1Distance = 1;
    int Person2Distance = 3;
    int Person3Distance = 5;
    int Person4Distance = 7;
    int Person5Distance = 9;

    public int calculateDifference(int Distance1, int distance2) {
        if (Distance1 >= distance2) {
            return Distance1 - distance2;
        } else {
            return distance2 - Distance1;
        }
    }

    public int Distances(String names) {
        int distance = 0;
        switch (names) {
            case "A":
                distance = this.Person1Distance;
                break;
            case "B":
                distance = this.Person2Distance;
                break;
            case "C":
                distance = this.Person3Distance;
                break;
            case "D":
                distance = this.Person4Distance;
                break;
            case "E":
                distance = this.Person5Distance;
                break;
            default:
                System.out.println("Incorrect Input");
        }
        return distance;
    }

    public static void main(String[] args) {
        Distance distance = new Distance();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter start & end point:");
        String start=scanner.nextLine();
        String End=scanner.nextLine();
        int distance1=distance.Distances(start);
        int distance2=distance.Distances(End);
        if(distance1!=0 && distance2!=0) {
            System.out.println(distance.calculateDifference(distance1, distance2));
        }

    }
}

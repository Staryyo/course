package myhomework;


import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" попадает ли в интервал?");
        int i = scanner.nextInt();


        if (-15 < i && i <= 12) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        int k = scanner.nextInt();
        if (14 < k && k < 17) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        int j = scanner.nextInt();
        if (19 <= j ) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }


}

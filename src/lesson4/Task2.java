package lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        sumFromNullToNumberFor(a);
        sumFromNullToNumberWhile(a);
    }
     static void sumFromNullToNumberFor(int a){
         int sum = 0;
        for (int i = 0; i <= a; i++) {
        sum = sum + i;

    }
        System.out.println(sum);
    }
    static void sumFromNullToNumberWhile(int a){
        int sum = 0;
        int i=0;
        while (i<=a){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}


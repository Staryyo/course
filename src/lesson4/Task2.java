package lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        summFromNullFor(a,sum);
        summFromNullWhile(a, sum);
    }
     static void summFromNullFor(int a, int sum){
        for (int i = 0; i <= a; i++) {
        sum = sum + i;
    }
        System.out.println(sum);
    }
    static void summFromNullWhile(int a, int sum){
        int i=0;
        while (i<=a){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}


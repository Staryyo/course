package lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        summaFromNullFor(a,sum);
        summaFromNullWhile(a, sum);
    }
     static void summaFromNullFor(int a, int sum){
        for (int i = 0; i <= a; i++) {
        sum = sum + i;
    }
        System.out.println(sum);
    }
    static void summaFromNullWhile(int a, int sum){
        int i=0;
        while (i<=a){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}


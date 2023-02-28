package lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String c = scanner.next();
        int d = scanner.nextInt();
        int t = 0;
        switch (c) {
            case "-":
                t = x - d;
                break;
            case "+":
                t = x + d;
                break;
            case "*":
                t = x * d;
                break;
            case "/":
                t = x / d;
                break;
        }
        System.out.println(t);
    }
}

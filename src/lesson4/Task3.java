package lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String c = scanner.next();
        int y = scanner.nextInt();
        int res = 0;
        switch (c) {
            case "-":
                res = x - y;
                break;
            case "+":
                res = x + y;
                break;
            case "*":
                res = x * y;
                break;
            case "/":
                res = x / y;
                break;
        }
        System.out.println(res);
    }
}

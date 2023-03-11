package lesson6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String operation = scanner.next();
        System.out.println(calc(num1, num2, operation));

    }

    static double calc(int num1, int num2, String operation) {
        switch (operation) {
            case "-":
                return num1 - num2;
            case "+":
                return num1 + num2;
            case "/":
                return num1 / num2;
            case "*":
                return num1 * num2;
            default: return 0;
        }
    }
}

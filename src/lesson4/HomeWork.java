package lesson4;

import java.util.Scanner;

public class HomeWork {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            for (int b = 1; b <= num; b++) {
                System.out.print(b * i + " ");
            }
            System.out.println(" ");
        }

    }

}


package lesson4;

import java.util.Scanner;

public class HomeWork {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++ ) {
            for (int b = 1; b <= 10; b++) {

                System.out.print(b * i + " ");
            }
            System.out.println(" ");
        }

    }


}




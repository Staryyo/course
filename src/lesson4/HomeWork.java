package lesson4;

import java.util.Scanner;

public class HomeWork {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++ ) {
            for (int j = 1; j <= 10; j++) {

                System.out.print(j * i + " ");
            }
            System.out.println(" ");
        }

    }


}




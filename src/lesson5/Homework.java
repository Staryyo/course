package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 2) {
            String name1 = "Сергей";
            String name2 = "Никита";
            String[] mas = new String[]{name1, name2};
            System.out.println(Arrays.toString(mas));
        } else if (num % 2 != 0) {
            String[] mas = new String[num];
            for (int i = 0; i < mas.length; i++) {
                String bazar = scanner.next();
                mas[i] = bazar;
            }
            System.out.println(Arrays.toString(mas));
        } else if (num % 2 == 0) {
            int[] mas = new int[num];
            for (int i = 0; i < mas.length; i++) {
                int randomValue = (int) (Math.random() * 100);
                mas[i] = randomValue;

            }
            System.out.println(Arrays.toString(mas));
        }


    }

}

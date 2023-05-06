package homework8;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Integer.parseInt;

//есть массив целых чисел.
       // Если пользователь вводит: while, то массив печатается таким образом: while: массив.
        //Если пользователь вводит for, то печатается: for: массив
public class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int[] mas = new int[25];
        if (Objects.equals(n, "for")) {
            for (int i = 0; i < mas.length; i++) {
                mas[i] = ThreadLocalRandom.current().nextInt(1, 100);
            }
            System.out.print( "for:");
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
        } else if (Objects.equals(n, "while")) {
            int i = 0;
            int j = 0;
            while (i < mas.length) {
                mas[i] = ThreadLocalRandom.current().nextInt(1, 100);
                i++;
            }
            System.out.print("while:");
            while (j < mas.length){
            System.out.print(mas[j] + " ");
                j++;
        }
    }
}
}
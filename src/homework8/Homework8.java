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
        int[] mas = new int[10];
        if (Objects.equals(n, "for")) {
            for (int i = 0; i < mas.length; i++) {
                mas[i] = ThreadLocalRandom.current().nextInt(1, 100);
            }
            System.out.println("For" + ":" + Arrays.toString(mas));
        }
        else if (Objects.equals(n, "while")) {
            int i = 0;
           while (i < mas.length){
               mas[i] = ThreadLocalRandom.current().nextInt(1, 100);
               i++;
           }
            System.out.println("while" + ":" + Arrays.toString(mas));
        }
    }
}
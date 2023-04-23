package lesson7;
//Есть 2 целых числа
//      Если пользователь вводит с клавиатуры «массив», то создается массив из этих двух чисел
//    Если вводит «большоймассив», то создается массив из 6 чисел (первые 2 числа - даны, остальные - рандомные значения)
//  Если вводит «меньшее», то программа возвращает меньшее число, тоже самое сделать и с большим числом
//Если вводит что-то другое, то программа возвращает - «нет логики для этой команды»

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int x = 7;
        int z = 9;
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        if (Objects.equals(num, "массив")) {
            int[] mas = new int[2];
            mas[0] = x;
            mas[1] = z;
            System.out.println(Arrays.toString(mas));
        } else if (Objects.equals(num, "большой массив")) {
            int[] mas = new int[6];
            mas[0] = x;
            mas[1] = z;
            for (int i = 2; i < mas.length; i++) {
                mas[i] = rnd.nextInt(25);
            }
            System.out.println(Arrays.toString(mas));
        } else if (Objects.equals(num, "меньшее")) {
            if (x < z) {
                System.out.println(x);
            }

        } else if (Objects.equals(num, "большее")) {
            if (z > x) {
                System.out.println(z);
            }

        } else {
            System.out.println("Нет логики для выполнения этой команды");
        }
    }

}

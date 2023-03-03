package lesson4;
//Задача 2
//        Пользователь вводит число с клавиатуры
//        Программа строит на основе этого числа ступеньки из звездочек
//        Пример
//        Ввели число: 5
//        Вывод:
//        *
//        **
//        ***
//        ****
//        *****

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String star = "*";
        for (int i = 0; i < count; i++) {
            System.out.println(star);
            star += "*";
        }
    }

}

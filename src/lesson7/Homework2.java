package lesson7;
//Пользователь вводит число с клавиатуры
//      Если это число больше 10, то оно умножается на 2, если больше 5, но меньше 10, то делиться на 2
//    Если больше 20, то умножается само на себя

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (5 < num && num < 10) {
            double number = num / 2.0;
            System.out.println(number);

        }
        else if (num > 20) {
            int number = num * num;
            System.out.println(number);
        }
        else if (num > 10) {
             int number = num * 2;

            System.out.println(number);
        }

    }
}



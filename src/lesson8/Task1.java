package lesson8;

import java.util.Scanner;

//Есть 2 числа, если пользователь вводит "сумма", то они прибавляются,
//      тоже самое и для остальных операций (деление, умножение и вычитание).
//    Если число на которое нужно будет делить будет равно 0, то вывести - деление невозможно
public class Task1 {
    public static void main(String[] args) {
        int x = 32;
        int y = 14;
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        switch (num) {
            case "сумма":
                System.out.println(x + y);
                break;
            case "вычитание":
                System.out.println(x - y);
                break;
            case "умножение":
                System.out.println(x * y);
                break;
            case "деление": {
                if (y != 0) {

                    System.out.println(x /(double) y);
                } else {
                    System.out.println("деление невозможно");

                }

                break;

            }

        }

    }
}

package myhomework;
//пользователь вводит что-то с клавиатуры и если это число, то он прибавляет его.
//если end, то возвращает сумму чисел

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int sum = 0;
        while (!x.equals("end")){
           int  num = Integer.parseInt(x);
             sum = sum + num;
             x = scanner.nextLine();
        }
        System.out.println(sum);
    }
}

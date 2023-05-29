package lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Пользователь вводит числа с клавиатуры до end, далее перебирается массив и если число в массиве-->
//      Если это число больше 10, то оно умножается на 2, если больше 5, но меньше 10, то делиться на 2
//    Если больше 20, то умножается само на себя
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> integers = new ArrayList<>();
        while (!input.equals("end")){
            integers.add(Integer.valueOf(input));
            input = scanner.nextLine();
        }

        for (int i = 0; i < integers.size(); i++) {
           int x = integers.get(i);
           int number = 0;
            if (5 < x && x < 10) {
                 number = (int) (x / 2.0);

            }
            else if (x > 20) {
                 number = x * x;

            }
            else if (x > 10) {
                 number = x * 2;


            }
            integers.set(i,number);
        }
        System.out.println(integers);
    }
}

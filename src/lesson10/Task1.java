package lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//пользователь вводит что-то с клавиатуры
// каждое число записывается в arraylist
//если end, то возвращает сумму чисел
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> integers = new ArrayList<>();
        int sum = 0;
        while (!input.equals("end")){
            integers.add(Integer.valueOf(input));
            input = scanner.nextLine();
        }
        for (int i = 0; i < integers.size(); i++) {
            sum  = sum + integers.get(i);
        }
        System.out.println(sum);

    }
 }

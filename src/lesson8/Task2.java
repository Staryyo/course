package lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
//Есть массив вещественных чисел, с размерностью n (вводится с клавиатуры).
//      Если это число n < 1,  то программа просит заново ввести число n.
//    Если число n > 1, то программа заполняет все элементы массива рандомными значениями от 1 до 10.
//  Если n = 6, то заполняются от 1 до 6
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n < 1){
            System.out.println("Введите число больше 1");
            n = scanner.nextInt();
        }
        double[] mas = new double[n];
        if(n == 6) {
            for (int i = 0; i < mas.length; i++) {
                mas[i] = i + 1 ;

            }
            System.out.println(Arrays.toString(mas));
        }
       else if (n > 1){
            for (int i = 0; i < mas.length; i++) {
             mas[i] = ThreadLocalRandom.current().nextDouble(1, 11);
            }
            System.out.println(Arrays.toString(mas));
        }

    }
}

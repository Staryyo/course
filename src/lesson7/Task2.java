package lesson7;
//есть массив целых чисел
//    если пользователь вводит с клавиатуры 1, то каждый элемент массива делится на 2, и значения записываются в новый массив
//  если пользователь вводит 2, то создается новый массив double и заполняется значениями из старого массива
//если пользователь вводит 3, то программа выводит массив в обратном порядке
//если пользователь вводит что-то другое, то программа выводит - "Нет логики для выполнения этой команды"


import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[]{1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1: {
                double[] resultMas = new double[mas.length];
                for (int i = 0; i < mas.length; i++) {
                    double number = mas[i] / 2.0;
                    resultMas[i] = number;
                }

                System.out.println(Arrays.toString(resultMas));
                break;
            }
            case 2: {
                double[] resultMas = new double[mas.length];
                for (int i = 0; i < mas.length; i++) {
                    resultMas[i] = mas[i];
                }
                System.out.println(Arrays.toString(resultMas));
                break;
            }
            case 3: {
                for (int i = mas.length - 1; i >= 0; i--) {
                    System.out.print(mas[i] + " ");
                }
                break;
            }
            default:
                System.out.println("Нет логики для выполнения этой команды");

        }

    }
}

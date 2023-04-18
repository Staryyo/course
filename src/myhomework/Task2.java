package myhomework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double c = scanner.nextDouble();
        double v = scanner.nextDouble();
        double[] arr = {10, 14, 3};
        double max = arr[0];
        double min = arr[0];
        double sred = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                max = x;
            } else if (min > arr[i]) {
                min = arr[i];
                min = c;
            } else if (sred == arr[i]) {
                sred = arr[i];
                sred = v;
            }
            System.out.println(i);

        }

    }


}

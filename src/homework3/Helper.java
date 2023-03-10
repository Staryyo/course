package homework3;

import java.util.Arrays;

public class Helper {
    public static void main(String[] args) {
        double[] array = new double[]{1.2, 4.9, 4.6, 10.4, 6.4, 4, 7.4, 1.2};
        findMin(array);
        findMax(array);
        sort(array);

    }

    static double findMin(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }


        }
        System.out.println(min);
        return min;
    }

    static double findMax(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println(max);
        return max;
    }

    static void sort(double[] array) {
        boolean isSorted = false;
        double buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

    }
}

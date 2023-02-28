package homework3;

import java.util.Scanner;

public class inOut {
    static double[] getArray(String line) {
        String[] s = line.split(" ");
        double[] mas = new double[s.length];
        for (int i = 0; i < s.length; i++) {
            mas[i] = Double.parseDouble(s[i]);
        }
        return mas;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input =scanner.nextLine();
        double[] array = getArray(input);
        printArray(array);
        printArray(array, "Хуйлуша");


    }
    static void printArray(double[ ] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
    static void printArray(double[ ] array, String name){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s + %s ", array[i], name);
        }
    }

}

package myhomework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int num = 0;
        while (!x.equals("end")){
             num = Integer.parseInt(x);
             x = scanner.nextLine();
        }
        System.out.println(num);
    }

}

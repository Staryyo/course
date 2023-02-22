package homework2;

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.print("a = ");
        a = in.nextDouble();
        System.out.print("b = ");
        b = in.nextDouble();
        System.out.print("c = ");
        c = in.nextDouble();
        double d = b * b - 4 * a * c;
        if (d < 0)
            System.out.println("корней нет");
        else if (d == 0) {
            double x = (-b) / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1 = (-b+Math.sqrt(d))/(2*a);
            double x2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }

    }
}

package homework2;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        int month;
        try (Scanner sc = new Scanner(System.in)) {

            month = sc.nextInt();
        }
        String  s;
        switch (month){
            case 1:   s  = "Январь";
            break;
            case 2: s  = "Февраль";
            break;
            case 3: s  = "Март";
            break;
            case 4:  s  = "Апрель";
            break;
            case 5:  s  = "Май";
            break;
            case 6:   s  = "Июнь";
            break;
            case 7:   s  = "Июль";
            break;
            case 8:   s = "Август";
            break;
            case 9:   s = "Сентябрь";
            break;
            case 10:   s  = "Октябрь";
            break;
            case 11:  s  = "Ноябрь";
            break;
            case 12:    s = "Декабрь";
            break;
            default: s = "нет такого месяца";

        }
        System.out.println(s);



    }
}

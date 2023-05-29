//если пользователь вводит 4, то создается ArrayList с длинной 4 и заполняется рандомными значениями
//если пользователь вводит 0, то создается ArrayList с элементами от 10 до 1, а потом сортируется в порядке возрастания

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        List<Integer> integers = new ArrayList<>();
        if (input == 4) {
            printRandomList(integers);
        } else if (input == 0) {
            printSortedList(integers);
        } else {
            System.out.println("Нет такого значения");
        }
    }

    public static void printRandomList(List<Integer> integers) {
        for (int i = 0; i < 4; i++) {
            integers.add(ThreadLocalRandom.current().nextInt());
        }
        System.out.println(integers);
    }

    public static void printSortedList(List<Integer> integers) {
        for (int i = 10; i > 0; i--) {
            integers.add(i);
        }
        integers.sort(new TaskComparator());
        System.out.println(integers);
    }
}

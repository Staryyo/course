package lesson4;

public class HomeWork2 {
    public static void main(String... args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                int res = j * i;
                System.out.printf("%d ", res);
            }
            System.out.println(" ");

        }
    }
}

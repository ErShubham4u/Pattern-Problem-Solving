import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = (n / 2) + 1;

        // First part
        for (int i = 0; i < x; i++) {
            for (int j = 1; j <= x- i - 1; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second part
        for (int i = 1; i <= (n - x); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= n - (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

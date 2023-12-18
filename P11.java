import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(".");
            }
            for (int j = i + 1; j <= 2 * i + 1; j++) {
                System.out.print(j);
            }
            //2nd loop
            for (int j = 2 * i; j >= i + 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

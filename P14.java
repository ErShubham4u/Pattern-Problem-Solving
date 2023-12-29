import java.util.*;
public class P14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        for (int i = 1; i <= o; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= o; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print numbers
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(k);
            }
            
            // Break the line
            System.out.println();
        }
    }
}

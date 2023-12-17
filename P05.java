import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i = 0 ; i < n ; i++){
            for (int j = i ; j <= 2*i ; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

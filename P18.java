public class P18 {
    public static void main(String[] args) {
        int n;
        // Initialize 'n' with the desired value
        n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 2 * i + 1; j < 2 * n; j += 2) {
                System.out.print(j + " ");
            }
            int a = 1;
            for (int k = 0; k < i; k++) {
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
    }
}

public class P15 {
    public static void main(String[] args) {
        int n; // assuming n is defined somewhere
        n = 3;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
                if (j < i + 1) {
                    System.out.print("+");
                }
                sum += j;
            }
            System.out.println("=" + sum);
        }
    }
}

import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print((char)(65+n-j-1)+" ");
            }
            System.out.println(); 
        }
    }
}
 

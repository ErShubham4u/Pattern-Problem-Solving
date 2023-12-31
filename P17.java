public class P17 {
    public static void main(String args[]) {
        for(int i=0;i<6;i++)
            {
                System.out.print("*");
            }
       System.out.println();
        for(int i=0;i<3;i++)
            {
                System.out.print("*");
                for(int j=3;j>=i+1;j--)
                    {
                        System.out.print(" ");
                    }
                System.out.print("*");
                
                  System.out.println();
            }
       System.out.print("*");
  }
}

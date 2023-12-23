class Solution {

    void printSquare(int n) {
        // code here
        int total=(n*2)-1;
      for(int i=0;i<(total/2)+1;i++)
          {
              for(int j=0;j<=i-1;j++)
                  {
                      System.out.print(n-j+" ");
                  }
                  
              for(int j=i;j<total-i;j++)
                 {
                     System.out.print(n-i+" ");
                 }
             for(int j=n-i+1;j<=n;j++)
                 {
                     System.out.print(j+" ");
                 }
             System.out.println();
          }
          
     int x=total/2;     
     for(int i=0;i<x;i++)
         {
             for(int j=n;j>=3+i;j--)
                {
                    System.out.print(j+" ");
                }
             for(int j=0;j<3+(2*i);j++)
                {
                    System.out.print(i+2+" ");
                }
             for(int j=x-2-i;j>=0;j--)
                {
                    System.out.print(n-j+" ");
                }
             System.out.println();
         }
    }
}
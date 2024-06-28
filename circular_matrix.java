import java.util.*;
class circular_matrix{
    public static void main(String ss[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        int ar[][]=new int[n][n];
        int c1=0;
        int c2=n-1;
        int r1=0;
        int r2=n-1;
        int k=1;
        do{
            for(int i=c1;i<=c2;i++){
                ar[r1][i]=k;
                k++;
            }

            for(int j=r1+1;j<=r2;j++){
                ar[j][c2]=k;
                k++;
            }

            for(int i=c2-1;i>=c1;i--){
                ar[r2][i]=k;
                k++;
            }

            for(int j=r2-1;j>=r1+1;j--){
                ar[j][c1]=k;
                k++;
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        while(k<=(n*n)); 
            for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
        

    }
}
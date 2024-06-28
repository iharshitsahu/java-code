import java.util.Scanner;

public class Pattern92 {
    public static void main(String args []) { 
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= (2*n)-1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                if(j==1||j==(2*i)-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(i==1||i==n||j==1||j==m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();   
        }
        sc.close();
    }
}    

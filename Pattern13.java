import java.util.Scanner;

public class Pattern13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
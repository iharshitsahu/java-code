import java.util.Scanner;

class Pattern66
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=i; j<n; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=(i*2)-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        n=n-1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=2*(n-i)+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();

    }
}
public class Pattern57 {
    public static void main(String args[]) {
        int n=5;
        int i = 5;
        int j = 9;
        for(i=1; i<=n; i++) {
            for(j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        for(i=2; i<=4; i++) {
            for(j=6; j<=i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
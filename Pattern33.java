public class Pattern33 {
    public static void main(String args[]) {
        int n=5;
        n=n-1;
        for(int i=1; i<n; i++) {
            for(int j=i; j<=i; j++) {
                if(j=2*(n-i)+1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");

                }
            }
            System.out.println();
        }
    }
}
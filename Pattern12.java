import java.util.Scanner;

public class Pattern12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=m; j++) {
                //cell -> (i,j)
                if(i == 1 || i == n || j == 1 || j ==m){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Harshit Sahu");
        sc.close();
    }
}
import java.util.Scanner;

public class excep1 {
    void divide() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int sum = 0;
        int arr[] = {2,5,6,8,4};
    }
        for(int i=0; i<=5; i++) {
            sum = sum+arr[i];
        }
    Scanner sc = new Scanner(System.in);
    int b=sc.nextInt();
    int c= sum/b;
    System.out.print("c="+c);
}
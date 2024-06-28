import java.util.Scanner;

public class ArraySum {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int s = sc.nextInt();
        int num[] = new int[s];
        int sum=0;
        for(int i=0; i<num.length; i++) {
            num[i] = sc.nextInt();
            sum = sum+num[i];
        }
        System.out.println("Sum of valus of array:-"+sum);
        sc.close();
        
    }
}
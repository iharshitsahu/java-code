import java.util.*;

public class CalculateSum {
    public static int SumNum(int a, int b) {
        int sum =a+b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = SumNum(a, b);
        System.out.println("Sum of 2 numbers:-"+sum);
        sc.close();
    }
}
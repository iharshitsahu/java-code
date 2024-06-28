import java.util.*;
public class Product {
    public static int Multiply(int a, int b) {
        return a*b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int Multiply=a*b;
        System.out.println("Product of 2 number:-"+Multiply);
        sc.close();
    }
}
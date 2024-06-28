import java.util.Scanner;
class simpleIntrest {
    public static void main(String[] args) {
        int p, r, t, si;
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        p = sc.nextInt();
        System.out.println("Enter the Rate of Interest: ");
        r = sc.nextInt();
        System.out.println("Enter the Time Period: ");
        t = sc.nextInt();
        si = (p * r * t) / 100;
        System.out.println("Simple Intrest is: " + si);
        sc.close();
    } 
}

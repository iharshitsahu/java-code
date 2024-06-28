import java.util.Scanner;

public class LinerSearch {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int num[] = new int[s];

        for(int i=0; i<num.length; i++) {
            num[i] = sc.nextInt();

        }
        
        int x = sc.nextInt();
        for(int i=0; i<num.length; i++) {
            if(num[i] == x) {
                System.out.println("x number found at index:+"+i);
            }
        }
        sc.close();
    }
}

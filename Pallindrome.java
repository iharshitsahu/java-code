import java.util.Scanner;

public class Pallindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean isPallindrome = false;
        int j = str.length()-1;
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i)==str.charAt(j)) {
                isPallindrome = true;
                j = j-1;
            } else {
                isPallindrome = false;
                break;
            }
        }
        if(isPallindrome) {
            System.out.println(str+" is pallindrome string");
        } else {
            System.out.println(str+" is not pallindrome string");
        }
    }
}
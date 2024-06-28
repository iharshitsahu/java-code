package practice2023;
import java.util.*;

/**
 * ArmstrongNum
 */
public class ArmstrongNum {
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;

        while (n>0) {
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        if(sum==original){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        boolean ans= isArmstrong(153);
        System.out.println(ans);
    }
    
}
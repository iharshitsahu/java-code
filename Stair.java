import java.util.Scanner;

public class Stair {
   public static int smallcal(int n) {
      
      if(n==1||n==2){
        return n;
      }
        else{
            int recCall1 = smallcal(n-1);
            int recCall2 = smallcal(n-2);
            return recCall1+recCall2;
        }
   } 

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int result = smallcal(n);
        System.out.println("Number of ways to reach the top of the stair: " + result);
   }
}

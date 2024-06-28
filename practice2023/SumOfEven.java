package practice2023;

import java.util.Scanner;

class  SumOfEven {

    public static int Sum(int n) {
        int sum= 0;
        sum=sum+n;
        return sum;
    }
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i=0;
            for(i=0; i<=n; i++) {
                if(i%2==0){
                    int i=m;
                    System.out.println(m);
                    
                }
                
            }
            int result=Sum(n);
            System.out.println(result);
            sc.close();
        }
    }

}
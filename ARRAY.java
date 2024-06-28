import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        double arr[]=new double[10];
        double sum=0.0, avg=0.0;
        System.out.println("Enter 10 numbers one by one:-");
        Scanner sc=new Scanner(System.in);
        for(int x=0; x<arr.length; x++){
            arr[x]=sc.nextDouble();
            sum+=arr[x];
        }
        avg=sum/arr.length;
        System.out.println("Summation:"+sum);
        System.out.println("Average :"+avg);
    }
}
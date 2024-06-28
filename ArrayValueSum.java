public class ArrayValueSum {
    public static void main(String args[]) {
        int num[];
        num = new int[5];
        num[0] = 1000000001;
        num[1] = 1000000002;
        num[2] = 1000000003;
        num[3] = 1000000004;
        num[4] = 1000000005;
        int sum =0;
        sum= sum+num[4];
        sum++;
        
        System.out.print("sum of values of array:"+sum);
    }
}

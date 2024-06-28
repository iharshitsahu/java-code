import java.util.Scanner;

class sumArray {
    public static int[] valOfArr(int[] arr, int n){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;i<arr.length;j++){
                if(arr[i]+arr[j]==n){
                    
                    return new int[]{i,j};
                }else {
                    {return null;}
                }
            }
            
        }
        return new int[]{i,j};
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] arr=sc.nextInt();
        int n=sc.nextInt();
        int[] result= valOfArr(int[] arr, int n);
        System.out.println(result);
    }
}

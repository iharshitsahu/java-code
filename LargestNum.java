public class LargestNum {
   
    public static void main(String [] args) {
        int n=5;
        int []a={3,2,1,5,2};
        
        int largest=a[0];
        for(int i=1;i<n;i++) {
            if(a[i]>a[0]){
                largest=a[i];
    
            }
        }

        int slargest=-1;
        for(int i=0; i<n; i++){
            if(a[i]>slargest && a[i]!=largest){
                slargest=a[i];
            } 
        }
        System.out.println(slargest);
    }
}

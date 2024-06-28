class Search {
    public static int linearSearch(int arr[],int x) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==x) {
                return i;
            } else {
                return -1;
            }
        }
        return()
    }

    public static void main(String args[]) {
        int arr[]={2,3,4,5,6};
        int x=4;
        int result=linearSearch(arr,x);

        if(result==-1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element at index:"+result);
        }
    }
}
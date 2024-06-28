class Stack1 {
    int arr[];
    int top; {
        arr = new int[5];
        top=-1;
    }
    void push(int a) {
        if(top==5) {
            System.out.println("Stsck is overflow");
        } else {
            ++top;
            arr[top]=a;
        }
    }
    void pop() {
        if(top==-1) {
            System.out.println("Under flow");
        } else {
            System.out.println(arr[top]);
            --top;
        }
    }
    void disp() {
        for(int i=0; i<=top; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Stack {
    public static void main(String args[]) {
        Stack1 s1,s2;
        s1= new Stack1();
        s2= new Stack1();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s2.pop();
        s2.pop();
    }
    
}

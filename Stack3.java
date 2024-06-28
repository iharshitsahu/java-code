class Stack {
    int top;
    int arr[];
    arr= new int[5];
    top=-1;
}
void push(int a) {
    if (top==4) {
    System.out.println("overflow");
    }
    else {
        ++top;
        arr[top]=a;
    }
}
void pop() {
    if (top==-1) {
        System.out.println("underflow");
    }
    else {
        System.out.println(arr[top]);
        --top;
    }
}
void disp() {
    for(int i=0;i<=top;i++) {
        System.out.println(arr[i]);
    }
}
class Stack3 {
    public static void main (String args[]) {
        Stack s1;
        s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
    }
}
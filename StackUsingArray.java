import java.util.Scanner;

public class StackUsingArray {
    int arr[];
    int size,top;
    StackUsingArray(int size)
    {
        arr=new int[size];
        this.size=size;
        top=-1;
    }
    public void push(int data)
    {
        if(top==size-1)
        System.out.println("Stack is ..........! ");
        else 
        {
            arr[++top]=data;
            System.out.println(arr[top]+" is Inserted");
 
        }
 
    }  
    public void pop()
    {
        if(top==-1)
        System.out.println("Stack is empty.......!");
        else
        {
            System.out.println(arr[top]+" is poped");
            top--;
        }
    }
    public void show()
    {
        if(top>=0)
        for(int i=0;i<=top;i++)
        System.out.println(arr[i]);
        else
        System.out.println("stack is empty.......!");
    }
    public static void main(String[] args) {
        StackUsingArray stack=new 
        StackUsingArray(10);
        Scanner sc=new Scanner(System.in);
        int data,ch;
        do
        {
            System.out.println("1.for Push\n2. for Pop\n3. for show\n4. for exit()");
            ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("Enter element: ");
                data=sc.nextInt();
                stack.push(data);
            }
            else if(ch==2)
            {
                stack.pop();
            }
            else if(ch==3)
            {
                stack.show();
            }
            else if(ch==4)
            {
                System.out.println("exit........!");
            }
            else
            System.out.println("Enter a valid choice.......!");
 
 
        }while(ch!=4);
    }
}
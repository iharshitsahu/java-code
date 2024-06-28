import java.util.Scanner;

class Queue {
    int arr[];
    int front; //delete
    int rear; //insert

    Queue( int n) {
        arr = new int[n];
        front = rear = -1;
    }

    void insert(int a) {
        if(rear==arr.length-1) {
            System.out.println("Queue is full");
            return;
        } else if(rear==1) {
            rear++;
            front++;
            arr[rear] = a;
        } else {
            arr[++rear] =a;
        }
        
    }

    void del() {
        if(front==-1) {
            System.out.println("Queue is empty");
            return;
        } else if(front==rear) {
            System.out.println(arr[front]+"is deleted");
            front = rear =-1;
        } else {
            System.out.println(arr[front]+"is deleted");
            front++;
        }
    }


    void disp() {
        if(front==-1) {
            System.out.println("Queue is empty");
            return;
        } else {
            for(int i=front; i<=rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}

class TQueue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. array:-");
        int n= sc.nextInt();
        Queue q1 = new Queue(n);
        for(int i=0; i<n; i++) {
            System.out.println("enter a value");
            q1.insert(sc.nextInt());
        }
        q1.disp();
        sc.close();
    }
}

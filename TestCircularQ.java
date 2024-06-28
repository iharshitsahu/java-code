import java.util.*;

class CircularQ {
    int arr[];
    int front;
    int rear;
    CircularQ(int s) {
        arr= new int[s];
        front=rear=-1;
    }

    void insert(int a) {
        if((rear==arr.length-1 && front==0) || (rear==front-1)) {
            System.out.println("Full");
        } else if(rear==-1) {
            front=rear=0;
            arr[rear] = a;
        } else if(rear==arr.length-1 && front!=0) {
            rear =0;
            arr[rear] =a;
        } else {
            rear++;
            arr[rear]= a;
        }
    }

    void del() {
        if(front==-1) {
            System.out.println("Empty");
            return;
        } else if(front==rear) {
            System.out.println(arr[front]);
            front=rear=-1;
        } else if(front== arr.length-1) {
            System.out.println(arr[front]);
            front=0;
        } else {
            System.out.println(arr[front]);
            front++;
        }
    }

    void disp() {
        if(front==-1) {
            System.out.println("Empty");
            return;
        } else if(front<= rear) {
            for(int i=0; i<=rear; i++) {
                System.out.println(arr[i]);
            }
        } else {
            for(int i=front; i<arr.length; i++) {
                System.out.println(arr[i]);
            }
            for(int i=0; i<=rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}

class TestCircularQ {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s= sc.nextInt();
        CircularQ q1 = new CircularQ(s);
        for(int i=0; i<s; i++) {
            System.out.println("Enter a value:-");
            q1.insert(sc.nextInt());
        }
        
        q1.disp();
    }
}
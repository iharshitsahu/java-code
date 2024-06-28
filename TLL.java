class Node {
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        next=null;
    }
}

class LL {
    Node head=null;
    Node tail=null;

    void addbeg(int a) {
        Node temp=new Node(a);
        if(temp==null) {
            System.out.println("heap is full");
            return;
        } else if(head==null) {
            head=tail=temp;
        } else {
            temp.next=head;
            head=temp;
        }
    }

    void disp() {
        for(Node i=head; i!=null; i=i.next) {
            System.out.println(i.data);
        }
    }
}

class TLL {
    public static void main(String args[]) {
        LL l1= new LL();
        l1.addbeg(10);
        l1.addbeg(20);
        l1.addbeg(30);
        l1.disp();
    }
}
public class CircularQULL {
 // Structure of a Node
    static class Node {
        int data;
        Node link;
    }
    static class Queue {
        Node front, rear;
    }
    static void enQueue(Queue q, int value)
    {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null)
        q.front = temp;
        else
        q.rear.link = temp;
        q.rear = temp;
        q.rear.link = q.front;
    }
    static int deQueue(Queue q)
    {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value; // Value to be dequeued
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }
        else // There are more than one 
        nodes
        {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }
    static void displayQueue(Queue q)
    {
        Node temp = q.front;
        System.out.printf("\nElements in Circular Queue are: ");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }
    public static void main(String args[])
    {
        Queue q = new Queue();
        q.front = q.rear = null;
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);
        displayQueue(q);
        System.out.printf("\nDeleted value = %d", deQueue(q));
        System.out.printf("\nDeleted value = %d", deQueue(q));
        displayQueue(q);
        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);
    }
}

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data=data;
    }
}
class Tree {


    void inorder(Node root) {
        if(root!=null) {
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }
    }

    void preorder(Node root) {
    
        if(root!=null) {
            System.out.print(root.data +" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        
        if(root!=null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}

class TestTree {
    public static void main(String args[]) {
        Node n2, n3, n4, n5, n6, n7;
        Node n1 = new Node(1);
        n2 = new Node(2);
        n3 = new Node(3);
        n4 = new Node(4);
        n5 = new Node(5);
        n6 = new Node(6);
        n7 = new Node(7);
        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        Tree t=new Tree();
        System.out.println("\nPre Order Traversal");
        t.preorder(root);
        System.out.println("\nIn Order Traversal");
        t.inorder(root);
        System.out.println("\nPost Order Traversal");
        t.postorder(root);
    }
}
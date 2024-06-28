class Testing{
    synchronized void evenNumb(){
        System.out.println("Thread 1 printing Even Numbers");
        for (int i=2;i<=100;i+=2){
            System.out.println(i);
        }
    }
    synchronized void oddNum(){
        System.out.println("Thread 2 printing Odd Numbers ");
        for (int i=1;i<=100;i+=2){
            System.out.println(i);
        }
    }
    synchronized void naturalNum(){
        System.out.println("Thread 3 printing Natural Numbers");
        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
    }
}

class A  extends Thread{
    Testing t;
    A (Testing t){this.t=t;}
    public void run() {
        t.evenNumb();
    }
}
class B  extends Thread{
    Testing t;
    B (Testing t){this.t=t;}
    public void run() {
        t.oddNum();
    }
}
class C  extends Thread{
    Testing t;
    C (Testing t){this.t=t;}
    public void run() {
        t.naturalNum();
    }
}
class ThreadTesting {
    public static void main(String[] args) {
        Testing t=new Testing();
        A a =new A (t);
        a.start();
        B b = new B(t);
        b.start();
        C c = new C(t);
        c.start();

    }
}

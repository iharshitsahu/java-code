class MyThread1 implements Runnable {
    public void run() {
        Table a1 = new Table();
        a1.printTable(5);
    }

    public void start() {
    }

}

class Table {
    synchronized void printTable(int n) {
        for(int i=1; i<=10; i++) {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}

class ThreadDemo {
    public static void main(String args[]) {
        System.out.println("Main thread only");
        MyThread1 t0 = new MyThread1();
        t0.start();
        
        System.out.println("Main thread");
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}




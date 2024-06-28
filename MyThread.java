class MyThread extends Thread {
    public void run(String args[]) {
        System.out.println("name"+ this.getName());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class ThreadDemo {
    public static void main(String args[]) {
        System.out.println("Main thread only");
        MyThread t0 = new MyThread();
        t0.start();
        
        System.out.println("Main thread");
        MyThread t1 = new MyThread();
        t1.start();
    }
}
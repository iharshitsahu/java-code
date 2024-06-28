class NaturalNumber extends Thread {
    public void run() {
        System.out.println("Frist thread printing naturalno.s");
        for(int i=1; i<=100; i++) {
            System.out.println(i);
        }
    }
}

class EvenNumber extends Thread {
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Second thread printing evenno.s");
        for(int i=2; i<=100; i++) {
            System.out.println(i);
        }
    }
}

class OddNumber extends Thread {
    public void run() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("third thread running");
        for(int i=1; i<=100; i++) {
            System.out.println(i);
        }
    }
}

public class TestThread {
    public static void main(String args[]) {
        NaturalNumber nn = new NaturalNumber();
        nn.start();
        EvenNumber en= new EvenNumber();
        en.start();
        OddNumber on = new OddNumber();
        on.start();
    }
}

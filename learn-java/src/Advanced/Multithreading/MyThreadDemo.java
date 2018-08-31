package Advanced.Multithreading;

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Concurent thread started running");
    }
}

public class MyThreadDemo {
    public static void main(String args[]){
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
    }
}

package Advanced.Multithreading;

class MyThread2 extends Thread {
    public void run(){
        System.out.println("r1 ");
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException ie) { }
        System.out.println("r2 ");
    }
}

public class MyThreadDemo2 {
    public static void main(String args[]) {
        MyThread2 mt1 = new MyThread2();
        MyThread2 mt2 = new MyThread2();
        mt1.start();
        try{
        mt1.join();
        } catch (InterruptedException ie){}
        mt2.start();
        System.out.println(mt1.isAlive());
        System.out.println(mt2.isAlive());
    }
}

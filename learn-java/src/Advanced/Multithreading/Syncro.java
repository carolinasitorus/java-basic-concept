package Advanced.Multithreading;

class First {
    synchronized void display(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.print("]");
    }
}

class Second extends Thread {
    String msg;
    First fobj;
    Second(First fp, String str){
        fobj = fp;
        msg = str;
        start();
    }
    public void run() {
        fobj.display(msg);
    }
}

public class Syncro {
    public static void main(String args[]){
        First fNew = new First();
        Second ss = new Second(fNew, "Welcome");
        Second ss1 = new Second(fNew, "New");
        Second ss2 = new Second(fNew, "Programmer");

    }
}

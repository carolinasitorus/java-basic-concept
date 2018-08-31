package ObjectOriented.Inheritance;

class Calculation {
    public void addition(int x, int y){
        System.out.println("Sum : " + (x+y));
    }

    public void substarction(int x, int y){
        System.out.println("Sub : " + (x-y));
    }
}

public class MyCalculation extends Calculation {
    public void multiplication(int x, int y){
        System.out.println("Mul: " + (x*y));
    }

    public static void main(String args[]){
        int a = 10;
        int b = 20;
        MyCalculation myCal = new MyCalculation();
        myCal.multiplication(a,b);
        myCal.addition(a,b);
        myCal.substarction(a,b);
    }
}

package ObjectOriented.Inheritance;

class SuperClass {
    int num = 20;
    public void display(){
        System.out.println("This is method of superclass");
    }
}

public class SubClass extends SuperClass {
    int num = 10;
    public void display(){
        System.out.println("This is method of subclass");
    }

    public void show() {
        SubClass subClass = new SubClass();
        subClass.display();
        super.display();
        System.out.println("Value of nun - Superclass : " + super.num);
        System.out.println("Value of num - Subclass : " + subClass.num);
    }

    public static void main(String args[]){
        SubClass subClass = new SubClass();
        subClass.show();
    }
}

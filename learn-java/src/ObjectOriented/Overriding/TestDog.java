package ObjectOriented.Overriding;

class Animal{
    public void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("Dog can move");
    }
    public void bark(){
        System.out.println("Dog can bark");
    }
}
public class TestDog {
    public static void main (String args[]){
        Animal animal= new Animal();
        animal.move();
        Dog dog = new Dog();
        dog.move();
        dog.bark();

    }
}

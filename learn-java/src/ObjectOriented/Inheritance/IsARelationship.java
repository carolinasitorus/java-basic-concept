package ObjectOriented.Inheritance;
class Animal{}
class Dog extends Animal{}
class Mammal extends Animal{}
class Reptil extends Animal{}

public class IsARelationship extends Animal{
    public static void main(String args[]){
        Animal animal = new Animal();
        Dog dog = new Dog();
        Mammal mamal = new Mammal();
        Reptil reptil = new Reptil();
        System.out.println(mamal instanceof Animal);
        System.out.println(dog instanceof Animal);
        System.out.println(reptil instanceof Animal);
    }
}

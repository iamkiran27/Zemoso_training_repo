package OOPS_Implementation.Inheritance.SingleInheritance;

public class Animal {

    public void eat() {
        System.out.println("Eating !!!");
    }
}

class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class SingleInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
    }}
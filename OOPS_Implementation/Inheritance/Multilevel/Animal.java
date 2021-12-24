package OOPS_Implementation.Inheritance.Multilevel;

public class Animal {
    void eat(){System.out.println("animal is eating...");}
}


class Dog extends Animal{
    void bark(){System.out.println("dog is barking...");}
    void  weep()
    {

    }
}
class Puppy extends Dog{
    void weep(){System.out.println("puppy is weeping...");}
}
class Multilevel{
    public static void main(String args[]){
        Dog d=new Puppy();
        d.weep();
        d.bark();
        d.eat();
    }}
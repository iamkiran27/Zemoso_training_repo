package OOPS_Implementation.Polymorphism.RuntimePolyMorphism;

public class Person {
    void Print()
    {
        System.out.println("parent class");
    }
}
class Boy extends Person {


    void Print() { System.out.println("Boy class"); }
}

class Girl  extends Person {


    void Print()
    {


        System.out.println("Girl class");
    }
}

class Main {
    public static void main(String[] args) {
        Person a;



        a = new Boy();
        a.Print();

        a = new Girl();
        a.Print();
    }
}

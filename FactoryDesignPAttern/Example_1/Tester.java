package FactoryDesignPAttern.Example_1;

public class Tester extends Employee{
    public Tester(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("Doing Testing......");
    }
}

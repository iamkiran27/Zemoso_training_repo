package FactoryDesignPAttern.Example_1;

public class Developer  extends  Employee{



    public Developer( String type) {
        super( type);
    }

    @Override
    void work() {
        System.out.println("DEveloping the application....");

    }
}

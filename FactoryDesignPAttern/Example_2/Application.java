package FactoryDesignPAttern.Example_2;

public class Application {
    public static void main(String[] args) {
        Laptop laptop = LaptopFactory.getInstance("Dell");
        laptop.showSpecs();
    }
}

package FactoryDesignPAttern.Example_2;

public abstract class Laptop {
     protected String manufacturedCompany;


    Laptop(String manufacturedCompany)

    {
        this.manufacturedCompany = manufacturedCompany;
    }

    public abstract void showSpecs();

}

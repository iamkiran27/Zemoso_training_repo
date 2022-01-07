package FactoryDesignPAttern.Example_2;

public class DellLaptop extends Laptop {
    private  int ramSize;
    private String processor;
    DellLaptop(String manufacturedCompany, int ramSize, String processor) {
        super(manufacturedCompany);

        this.processor = processor;
        this.ramSize = ramSize;
    }

    @Override
    public void showSpecs() {
        System.out.println("Manufactured by: "+super.manufacturedCompany+"\n"+"Ram: "+this.ramSize+"gb"+"\n"+"Processor: "+this.processor);
    }
}

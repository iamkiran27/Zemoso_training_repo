package FactoryDesignPAttern.Example_2;

public class HPLaptop  extends  Laptop {
    private int ramSize;
    private String processor;

    HPLaptop(String manufacturedCompany, int ramSize, String processor) {
        super(manufacturedCompany);
        this.ramSize = ramSize;
        this.processor = processor;
    }

    @Override
    public void showSpecs() {
        System.out.println("Manufacturer : " + super.manufacturedCompany + "\n" + "Ram : " + this.ramSize + "gb"+"\n" + "Processor : " + this.processor);
    }

    public String getManufacturedCompany() {
        return super.manufacturedCompany;
    }
}
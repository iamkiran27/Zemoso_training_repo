package FactoryDesignPAttern.Example_2;

public class LaptopFactory {

    public  static  Laptop getInstance(String manufacturedBy)
    {
        switch (manufacturedBy)
        {
            case "Dell": return  new DellLaptop(manufacturedBy,8,"Intel i5 8th gen");
            case "Hp": return  new HPLaptop(manufacturedBy,4,"AMD Ryzen5");

        }
        return  null;
    }
}

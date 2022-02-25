package FactoryDesignPAttern.Example_1;

public class EmployeeFactory {

    public static Employee getInstance(String type)
    {
        switch (type)
        {
            case "Tester" : return new Tester(type);
            case "Developer": return  new Developer(type);
        }
        return  null;
    }
}

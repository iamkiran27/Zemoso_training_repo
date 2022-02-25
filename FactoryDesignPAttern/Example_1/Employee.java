package FactoryDesignPAttern.Example_1;

public abstract class Employee {
    private String type;

    public Employee( String type )
    {

        this.type = type;

    }

    abstract void work();
    public String getType()
    {
        return  this.type;
    }
}

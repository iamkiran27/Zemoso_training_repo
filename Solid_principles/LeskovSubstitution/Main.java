package SOLID.LeskovSubstitution;



abstract class Coffee{

    public  void makeCoffee()
    {
        System.out.println("Making coffee....");
    }
    public void addCoffePowder()
    {
        System.out.println("Added coffee powder");
    }
    abstract  void addCream();
}

class Cappuchino extends  Coffee{

    public void makeCoffee()
    {
        System.out.println("Making Cappuchino coffee");
    }


    @Override
    public void addCream() {
        System.out.println("Added Cream..!!");
    }
}


public class Main {
    public static void main(String[] args) {
        Coffee c = new Cappuchino();
        c.makeCoffee();
        c.addCoffePowder();
        c.addCream();

    }


}

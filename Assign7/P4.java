package JAVA.Assign7;

interface Cycle{
  void wheels();
  void gears();
}
class Unicycle implements Cycle{


    @Override
    public void wheels() {
        System.out.println("Has one wheel");
    }

    @Override
    public void gears() {
        System.out.println("Has no gears");

    }
};
class Bicycle implements Cycle{


    @Override
    public void wheels() {
        System.out.println("HAs 2 wheels");
    }

    @Override
    public void gears() {
        System.out.println("Has 2 gears");

    }
};
class Tricycle implements Cycle{


    @Override
    public void wheels() {
        System.out.println("Has 3 wheeels");

    }

    @Override
    public void gears() {
        System.out.println("Has 4 gears");

    }
};


class CycleFactory {
    public  static  Cycle getInstance(String cycle)
    {
        switch (cycle)
        {
            case "Unicycle": return  new Unicycle();
            case "Bicycle": return  new Bicycle();
            case "Tricycle" : return  new Tricycle();

        }
        return  null;
    }
}
public class P4 {
    public static void main(String[] args) {
        Cycle c = CycleFactory.getInstance("Unicycle");
        c.gears();
        c.wheels();
    }
}

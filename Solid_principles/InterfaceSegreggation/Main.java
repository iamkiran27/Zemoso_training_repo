package SOLID.InterfaceSegreggation;



interface VegCardMenu
{
    void showVegItems();
}
interface  NonvegCardItems
{
    void showNonvegItems();

}

class VegClients implements VegCardMenu
{

    @Override
    public void showVegItems() {
        System.out.println("Showing veg card menu,");
    }

    public void BookSeatsforVeg(int members)
    {
        System.out.println(members + " seats booked for nonveg.");
    }
}

class  NonvegCLients implements  NonvegCardItems{

    @Override
    public void showNonvegItems() {
        System.out.println("Showing nonveg card menu.");
    }
    public void BookSeatsforNonveg(int members)
    {
        System.out.println(members + " seats booked for nonveg.");
    }
}





public class Main {

    public static void main(String[] args) {
        NonvegCLients nonveg = new NonvegCLients();
        nonveg.BookSeatsforNonveg(7);
        nonveg.showNonvegItems();
        VegClients veg = new VegClients();
        veg.BookSeatsforVeg(4);
        veg.showVegItems();

    }


}

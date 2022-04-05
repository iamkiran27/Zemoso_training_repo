package JAVA.Assign7;


abstract class Rodent{
    Rodent(){
        System.out.println("Constructor of Rodent is running.");
    }
    public abstract void eat();
    public abstract void skinColor();

} ;
class Mouse extends Rodent{
    Mouse(){
        System.out.println("Constructor of Mouse is running.");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating..");
    }

    @Override
    public void skinColor() {
        System.out.println("Mouse is blakish grey in color");

    }


};
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Constructor of Gerbil is running");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating and sleeping..");
    }

    @Override
    public void skinColor() {
        System.out.println("Gerbil skin color is brown");

    }


};
class Hamster extends Rodent{
    Hamster(){
        System.out.println("Constructor of Hamster is running");
    }

    @Override
    public void eat() {
        System.out.println("Amster is not eating !!");
    }

    @Override
    public void skinColor() {
        System.out.println("HAmster is white in color");

    }


};
public class P1 {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].eat();
        rodent[0].skinColor();
        rodent[1] = new Gerbil();
        rodent[1].eat();
        rodent[1].skinColor();
        rodent[2] = new Hamster();
        rodent[2].eat();
        rodent[2].skinColor();
    }
}


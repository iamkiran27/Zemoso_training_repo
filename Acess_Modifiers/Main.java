package Acess_Modifiers;

public class Main {
    public static void main(String[] args) {
        Access obj = new Access(10, "Kiran", 30);
        obj.getNum();
        System.out.println("Number is "+obj.getNum());
        obj.setNum(30);
        System.out.println("After setting , Number is "+obj.getNum());
        Access o2 = new Access(10, "Ram", 30);
        System.out.println(Access.countObj+" Objects aee create.");

    }
}

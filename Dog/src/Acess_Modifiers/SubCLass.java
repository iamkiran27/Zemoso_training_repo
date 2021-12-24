package Acess_Modifiers;

 class SubClass extends Access {

    public SubClass(int num, String name, int number) {
        super(num, name, number);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Sai Kiran", 67);
        int n = obj.num;
        System.out.println("Vlaue of n form base class is "+n);
        System.out.println(obj instanceof Access);
    }
}

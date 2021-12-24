package Acess_Modifiers;

public class Access {

    final int number;
    static int countObj;
    protected int num;
    String name;
    int[] arr;


    static  {
        System.out.println("This is a static block");
        countObj =0;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Access(int num, String name, int number) {
        this.number = number;
        this.num = num;
        this.name = name;
        this.arr = new int[num];
        countObj++;

    }
}


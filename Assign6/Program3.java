package JAVA.Assign6;

public class Program3 {
    private static   Program3[] program3Objs;
    Program3(String str)
    {
        System.out.println("String is : "+ str);
        program3Objs = new Program3[1];

    }

    public  static void addObj(Program3 p)
    {
        program3Objs[0] = p;
    }
    public static void main(String[] args) {
Program3 p = new Program3("Hello");
        addObj(p);
        System.out.println(program3Objs[0].getClass());
    }
}

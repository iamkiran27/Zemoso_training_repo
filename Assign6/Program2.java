package JAVA.Assign6;

public class Program2 {
    Program2() {

        System.out.println("constructor 1 is running. ");

    }
    Program2(String  str) {
        this();
        System.out.println(str);

    }
    public static void main(String[] args) {
        Program2 p = new Program2("HEllo");
    }
}

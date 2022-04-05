package JAVA.Assign7;


import java.util.Scanner;
interface A{
    public void getA();
    public void dispA();
}
interface B{
    public void getB();
    public void dispB();
}
interface C{
    public void getC();
    public void dispC();

}
interface D extends A, B, C {
    public void getD();

}
class E implements D{
    public void getA(){
        System.out.println("interface A get method");
    }
    public void dispA(){
        System.out.println("interface A disp method");
    }
    public void getB(){
        System.out.println("interface B get method");
    }
    public void dispB(){
        System.out.println("interface B disp method");
    }
    public void getC(){
        System.out.println("interface C get method");
    }
    public void dispC(){
        System.out.println("interface C disp method");
    }
    public void getD(){
        System.out.println("interface D get mehtod ");
    }


};

class P3 {

    static void method1(A a) {
        a.dispA();
    };
    static void method2(B b) {
        b.dispB();
    };
    static void method3(C c) {
        c.dispC();
    };
    static void method4(D d) {
        d.dispA();
    };

    public static void main(String[] args) {
        E s = new E();
        String st;
        Scanner in = new Scanner(System.in);


        method1(s);
        method2(s);
        method3(s);
        method4(s);

    }
}

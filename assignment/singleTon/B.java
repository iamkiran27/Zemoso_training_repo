package JAVA.Assign5.Kiran.assignment.singleTon;

public class B {
    String str;
    B(String otherStr){
        str=otherStr;
    }

//    public static B_method(String s) {
//        //static methods can only access static variables;
//        str=s;
//        B sc = new B(s);
//
//        //cannot create a obj and return obj in a static method as static doesn't deal with objects.
//        return sc;
//    }
    public void print() {
        System.out.println(str);
    }

    public static void main(String[] args)
    {
        String str = "ABCD";
        B obj = new B(str);
//        obj.B_method(str);
        obj.print();
    }
}

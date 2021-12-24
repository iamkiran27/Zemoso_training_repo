package OOPS_Implementation.Encapsulation;

public class Student {
    private String namw;
    private int rollno;
    private int age;


    public int getAge() {
        return this.age;
    }


    public String getName() { return this.namw; }


    public int getRoll() { return this.rollno; }


    public void setAge(int newAge) {
        age = newAge; }


    public void setName(String newName)
    {
        namw = newName;
    }


    public void setRoll(int newRoll) { rollno = newRoll; }
}

class TestEncapsulation {
    public static void main(String[] args)
    {
        Student obj = new Student();

        obj.setName("Kiran");
        obj.setAge(22);
        obj.setRoll(23);

        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll: " + obj.getRoll());

        // Direct access of geekRoll is not possible due to encapsulation
        // System.out.println("Geek's roll: " + obj.geekName);
    }
}

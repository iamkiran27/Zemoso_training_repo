package OOPS_Implementation.Association.Aggregation;

import java.util.ArrayList;

public class ClassRoom {

    private ArrayList<Student> list;

    ClassRoom(ArrayList<Student> s)
    {
        list = s;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "list=" + list +
                '}';
    }
}

class Student {
    int rollno;
    String name;

    Student(String name, int rollno)
    {
        this.rollno = rollno;
        this.name = name;
    }

}

class Main
{
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();

        s.add(new Student("Ram", 23));
        s.add(new Student("Kiran",21));
        ClassRoom c = new ClassRoom(s);
        System.out.println(c);
    }
}
package OOPS_Implementation.Encapsulation;

import java.util.*;


public class MyException extends Exception
{
    public MyException(String s)
    {
        super(s); //passes the message to the Throwable class.
    }
}


public  class Student {
    private String namw;
    private int rollno;
    private int age;
    private Scanner sc;

Student()
{
    sc = new Scanner(System.in);
}


    public int getAge() {
        
        return this.age;
    }


    public String getName() { return this.namw; }


    public int getRoll() { return this.rollno; }


    public void setAge() {
        
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        try{
             if(age <= 0 )
        {
                throw new MyException("Age must be greater than 0.");
        }
        this.age = age;
            
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
       
    }
    


    public void setName(String newName)
    {
        namw = newName;
    }


    public void setRoll() {
        
        System.out.print("Enter roll no : ");
        int roll = sc.nextInt();
        try{
            if(roll <=0)
            {
                                throw new  MyException("Rollno must be greater than 0.");

            }
            this.rollno = roll;
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
        
    }
}


class TestEncapsulation  {
    public static void main(String[] args)
    {
        Student obj = new Student();

        obj.setName("Kiran");
        obj.setAge();
        obj.setRoll();

        System.out.println("Student's name: " + obj.getName());
        
        //due to default constructor the values of age and rollno are automatically set to 0.
         if(obj.getAge() > 0)
                System.out.println("Student's age: " + obj.getAge());
          if(obj.getRoll()>0)
                System.out.println("Student's roll no : " + obj.getRoll());

    }
}

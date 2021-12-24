package dog;

//Basic java program to understand about classes and objects.

public class Dog {

   String name;
   int age;
   String breed;

    Dog() {
        System.out.println("Default constructor called !!");
   }

    Dog(String name, int  age, String breed)
   {

       this.name = name;
       this.age = age;
       this.breed = breed;
   }

   Dog(String name ,Dog d)
   {
       this.name = name;
       this.age = d.age;
       this.breed = d.breed;
   }

   public void  bark()
   {
       System.out.println(this.name+" is barking !!");
   }

   public  void  walk()
   {
       System.out.println(this.name+" is walking !!");
   }

   public  void eat()
   {
       System.out.println(this.name+" is eating.");
   }

}

class Main{
    public static void main(String[] args) {
        Dog obj = new Dog();

        Dog kio = new Dog("kio", 5,"hybrid");
        kio.bark();
        kio.eat();

        Dog k2 = new Dog("jacob",kio);
        k2.walk();


    }
}

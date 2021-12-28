package OOPS_Implementation.Abstaction;



 interface Vehicle {
     void  wheels(int wheels);
    default void pedal()
    {
        System.out.println("Pedalling !!");
    }
     void brake();
     void speed();
     void start();
}

abstract  class  Cycle implements Vehicle{
     public  void  wheels(int wheels)
     {
         System.out.println("It has "+wheels+" wheels.");
     }
     public void  pedal()
     {
         System.out.println("Pedalling the cycle.");

     }


     public  void brake()
     {
         System.out.println("Applying brake.!!");
     }


}
class  GearBicycle extends  Cycle{

    @Override
    public void speed() {
        System.out.println("It can go maximum till 6th gear speed.");
    }

    @Override
    public void start() {
        System.out.println("Started cycling the cycle.");
    }
}

class MountainBike extends Cycle{

    @Override
    public void speed() {
        System.out.println("Engine has a capacity to go with a maximum speed of 100kmph.");
    }

    @Override
    public void start() {
        System.out.println("Bike started..!!");
    }


}

class Main{
    public static void main(String[] args) {
       Vehicle b1 = new MountainBike();
       b1.wheels(4);
       b1.start();
       b1.speed();
       b1.brake();
       Vehicle v1 = new GearBicycle();

       v1.start();
       v1.wheels(2);
       v1.pedal();
       v1.speed();
    }
}
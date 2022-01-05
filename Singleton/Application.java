package Singleton;



public class Application {
    public static void main(String[] args) {
        ServerInterface s1 =  Server.getServerInstance();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(s1.getData());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(s1.getData());
            }
        });

        t1.start();
        t2.start();
     
    }

}

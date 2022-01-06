package Singleton;

public class Server implements  ServerInterface {
    private static ApplicationDatabase db =  null;
    private String data = "";
    private Server(){
        System.out.println("Initialised server");
        db = ApplicationDatabase.getDatabaseInstance();
    }
    private static Server s = null;
    public  static synchronized  Server getServerInstance()
    {
        if(s == null)
        {
            s = new Server();
            return  s;
        }
        else
        {
            return  s;
        }
    }

    public String getData()
    {
        //create multiple threads according to the number of requests and assign each thread to each of the request so that it increases the performance of the server.
        if (data == "")
        {
           data = db.getData();
           return data;
        
        }
        else
        {
            
            return  data;
        }

    }
}

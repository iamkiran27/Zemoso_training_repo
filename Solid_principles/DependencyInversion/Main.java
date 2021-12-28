package SOLID.DependencyInversion;

interface Connection{
    void connect();
    void  disconnect();

}

class Database implements Connection{


    @Override
    public void connect() {
        System.out.println("Connected to the database... ");
    }

    @Override
    public void disconnect() {
        System.out.println("CLosing connection with the database....");
    }

}

class  Application {
  private   Database db ;
  Application(Database db)

  {
      this.db = db;
  }
  void startApplication()
  {
      db.connect();
      System.out.println("Application started");
  }
  void closeApplication()
  {
      db.disconnect();
      System.out.println("Application successdully closed...");

  }
}
public class Main {
    public static void main(String[] args) {
        Connection conn = new Database();
        Application app = new Application((Database)conn);
        app.startApplication();
        app.closeApplication();
    }
}

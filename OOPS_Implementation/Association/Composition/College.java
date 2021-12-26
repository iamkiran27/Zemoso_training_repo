package OOPS_Implementation.Association.Composition;

public class College {
    private Library l;
    College()
    {
        l = new Library();
    }
    public Library getLibrary()
    {
        return l;
    }

    public void readBook()
    {
        System.out.println(l.readBook());
    }
    public  void takeBook()
    {
        System.out.println(l.takeBook());
    }
}

class  Library {

    public String readBook() {
        return ("Reading book !!");
    }

    public String takeBook(){
        return ("Book taken for lease");
    }


}

class Main{
    public static void main(String[] args) {
        College c = new College();
        c.readBook();
        c.takeBook();
    }
}


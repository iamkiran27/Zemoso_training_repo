package JAVA.Assign7;



import java.util.HashMap;
import java.io.*;

class FileReadWrite {
    HashMap<Character, Integer> Map = new HashMap();

    public void characterCount(){
        try {
            FileReader fileread = new FileReader("/home/saikk/test.txt");
            int index;

            while((index = fileread.read())!= -1) {

                if(!Character.isWhitespace((char)index)) {
                    if(Map.containsKey((char)index)) {
                        Map.put((char)index, Map.get((char)index)+1);
                    }
                    else {
                        Map.put((char)index, 1);
                    }
                }
            }
            System.out.println(Map);

            saveData();
        }
        catch (Exception e) {
            e.getMessage();
        }
    }

    public void saveData() {
        try {
            File f1 = new File("/home/saikk/count.txt");
            FileWriter output = new FileWriter(f1);
            output.write(Map.toString());
            output.close();
        }
        catch (Exception e) {
            e.getMessage();
        }
    }
};


class Assign11{

    public static void main(String[] args) {
        FileReadWrite obj = new FileReadWrite();
        obj.characterCount();

    }

}


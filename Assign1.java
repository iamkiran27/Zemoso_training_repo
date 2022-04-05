package JAVA;



import java.io.File;

import java.util.regex.*;
import java.io.IOException;

import java.util.Scanner;

public class Assign1 {
    private void findFile() throws IOException {


        File file = new File("/home/saikk");

        String str ;

        Scanner in = new Scanner(System.in);

        do{
            int ab =0;
            System.out.println("Enter the name of the file");

            str =in.nextLine();

            String[] files = file.list();

            for (String string : files){

                Boolean str1 = str.equals(string);

                if (str1){
                    ab = 1;
                    System.out.println("File Found : ");

                    File f1 = new File(str);
                    System.out.println(string);

                    System.out.println("Path : "+ f1.getAbsolutePath());
                }
            }

            if(ab == 0)
            {
                System.out.println("File not find : Reenter the name of the file.");
            }
        } while(true);
    }


    public static void main(String[] args) throws IOException {

        Assign1 obj =new Assign1();

//      obj.findFile();

        System.out.println(Pattern.matches("[a-zA-Z]+\\.[a-z]+\\z", "python.py"));//true (a or m or n once or more times)

    }

}




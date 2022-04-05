package JAVA;


import java.util.Scanner;
import java.util.regex.*;


public class Assign9 {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("^[A-Z][a-zA-z0-9]*\\@\\z");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input : ");
        String input = sc.nextLine();
        Matcher m = p.matcher(input);
        boolean b = m.matches();
        System.out.println(b);
    }
}

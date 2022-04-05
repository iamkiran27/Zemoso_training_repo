package JAVA;

import java.util.Scanner;

public class Assign2 {
    public static boolean containsAllAlphabets(String str) {
        boolean[] visited = new boolean[26];

        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                x = str.charAt(i) - 'a';


            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                x = str.charAt(i) - 'A';
            }
            visited[x] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!visited[i]) {
                return false;
            }


        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input : ");
        String input = sc.nextLine();
        System.out.println(Assign2.containsAllAlphabets(input));

    }
}

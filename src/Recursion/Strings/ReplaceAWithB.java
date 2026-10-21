package Recursion.Strings;

import java.util.Scanner;

public class ReplaceAWithB {
    static String replaceAWithB(String s) {
        if (s.isEmpty()) return "";
        char c = s.charAt(0) == 'a' ? 'b' : s.charAt(0);
        return c + replaceAWithB(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Result: " + replaceAWithB(s));
        sc.close();
    }
}


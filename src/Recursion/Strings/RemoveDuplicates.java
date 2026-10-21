package Recursion.Strings;

import java.util.Scanner;

public class RemoveDuplicates {
    static String removeChar(String s, char target) {
        if (s.isEmpty()) return "";
        if (s.charAt(0) == target) return removeChar(s.substring(1), target);
        return s.charAt(0) + removeChar(s.substring(1), target);
    }

    static String removeDuplicates(String s) {
        if (s.isEmpty()) return "";
        char c = s.charAt(0);
        return c + removeDuplicates(removeChar(s.substring(1), c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Without duplicates: " + removeDuplicates(s));
        sc.close();
    }
}

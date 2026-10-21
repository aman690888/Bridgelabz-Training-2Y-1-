package Recursion.Strings;

import java.util.Scanner;

public class Remove_Occurrence {
    static String removeChar(String s, char target) {
        if (s.isEmpty()) return "";
        if (s.charAt(0) == target) return removeChar(s.substring(1), target);
        return s.charAt(0) + removeChar(s.substring(1), target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("Result: " + removeChar(s, ch));
        sc.close();
    }
}

package Recursion.Strings;

import java.util.Scanner;

public class LengthWithoutLength {
    static int findLength(String s) {
        if (s.isEmpty()) return 0;
        return 1 + findLength(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Length: " + findLength(s));
        sc.close();
    }
}

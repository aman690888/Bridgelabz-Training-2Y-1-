package Recursion.Strings;

import java.util.Scanner;

public class CountCharacter {
    static int countChar(String s, char target) {
        if (s.isEmpty()) return 0;
        int add = (s.charAt(0) == target) ? 1 : 0;
        return add + countChar(s.substring(1), target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("'" + ch + "' occurs " + countChar(s, ch) + " time(s)");
        sc.close();
    }
}


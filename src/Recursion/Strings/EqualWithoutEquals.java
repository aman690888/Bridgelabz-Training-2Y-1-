package Recursion.Strings;

import java.util.Scanner;

public class EqualWithoutEquals {
    static boolean areEqual(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) return true;
        if (a.isEmpty() || b.isEmpty()) return false;
        if (a.charAt(0) != b.charAt(0)) return false;
        return areEqual(a.substring(1), b.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        if (areEqual(a, b)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        sc.close();
    }
}

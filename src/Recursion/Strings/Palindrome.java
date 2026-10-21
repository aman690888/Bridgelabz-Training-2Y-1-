package Recursion.Strings;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}


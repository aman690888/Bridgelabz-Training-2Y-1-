package Recursion.Strings;

import java.util.Scanner;

public class CountVowels {
    static int countVowels(String s) {
        if (s.isEmpty()) return 0;
        char c = Character.toLowerCase(s.charAt(0));
        int add = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        return add + countVowels(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Number of vowels: " + countVowels(s));
        sc.close();
    }
}

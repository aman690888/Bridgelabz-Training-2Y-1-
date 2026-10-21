package Recursion.Strings;
import java.util.Scanner;

public class PrintCharacters {
    static void printChars(String s) {
        if (s.isEmpty()) return;
        System.out.println(s.charAt(0));
        printChars(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        printChars(s);
        sc.close();
    }
}

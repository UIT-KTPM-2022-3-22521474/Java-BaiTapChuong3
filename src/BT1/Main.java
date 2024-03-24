package BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BT1 - String & StringTokenizer - String Manipulator - To Vinh Tien - 22521474.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string A: ");
        String inputA = scanner.nextLine();
        System.out.print("Enter string B: ");
        String inputB = scanner.nextLine();

        StringManipulator sm = new StringManipulator(inputA, inputB);
        System.out.println(STR."\nOccurrences of string B in string A: \{sm.countOccurrences()} times.");
        System.out.println(STR."String C - String A without spaces: \{sm.removeSpaces()}.");
        System.out.println(STR."String A is symmetric: \{sm.isSymmetric()}.");
        System.out.println(STR."String D - Reversed string A: \{sm.reverseWords()}.");
    }
}
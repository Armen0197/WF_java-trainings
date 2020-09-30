package day4.strings;

import Helpers.Helper;

import java.util.Scanner;

public class StringDemo {

    //1.
    public static char getCharByIndex(Scanner scanner) {
        System.out.println("Enter your words: ");
        String line = scanner.nextLine();
        System.out.println("Enter index: ");
        Helper.isInputDataInteger(scanner);
        int index = scanner.nextInt();
        return line.charAt(index);
    }

    //2.
    public static int countOfWords(Scanner scanner) {
        System.out.println("Enter your words: ");
        String line = scanner.nextLine();
        String[] arr = line.split(" ");
        return arr.length;
    }

    //3.
    public static void isPalindrome(Scanner scanner) {
        System.out.println("Enter your words: ");
        String line = scanner.nextLine();
        for (int i = 0, j = line.length() - 1; i < line.length() / 2; i++, j--) {
            if (line.charAt(i) != line.charAt(j)) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome!");
    }

    //4.
    public static void validParentheses(Scanner scanner) {
        int closedParenthesis = 0;
        int openParenthesis = 0;
        System.out.println("Enter parentheses: ");
        String line = scanner.nextLine();
        if (line.charAt(0) == ')') {
            System.out.println("Invalid");
            return;
        }
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                openParenthesis++;
            } else {
                closedParenthesis++;
            }
        }
        if (openParenthesis == closedParenthesis) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");
    }

    //5.
    public static void isLineContainSequenceOfChars(Scanner scanner) {
        System.out.println("Enter your words: ");
        String line = scanner.nextLine();
        String[] arr = line.split(" ");
        System.out.println("Enter the word you want to check: ");
        String sequenceOfChars = scanner.nextLine();
        for (String element : arr) {
            if (element.equals(sequenceOfChars)) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }

    //6.
    public static void firstLineStartsWithContentsOfAnotherLine(Scanner scanner) {
        System.out.println("Enter your first line: ");
        String firstLine = scanner.nextLine();
        System.out.println("Enter your second line: ");
        String secondLine = scanner.nextLine();
        if (firstLine.startsWith(secondLine)) {
            System.out.println("true");
        } else System.out.println("false");
    }

    //7.
    public static void firstLineEndWithContentsOfAnotherLine(Scanner scanner) {
        System.out.println("Enter your first line: ");
        String firstLine = scanner.nextLine();
        System.out.println("Enter your second line: ");
        String secondLine = scanner.nextLine();
        if (firstLine.endsWith(secondLine)) {
            System.out.println("true");
        } else System.out.println("false");
    }

    //8.
    public static String removingDuplicatesFromGivenLine(Scanner scanner) {
        System.out.println("Enter your line: ");
        String line = scanner.nextLine();
        char[] arr = line.toCharArray();
        StringBuilder newLine = new StringBuilder();
        for (char value : arr) {
            if (newLine.toString().indexOf(value) == -1) {
                newLine.append(value);
            }
        }
        return newLine.toString();
    }

    //9.
    static void divideString(Scanner scanner) {
        System.out.println("Enter your line: ");
        String line = scanner.nextLine();
        System.out.println("Enter the number of divisions: ");
        Helper.isInputDataInteger(scanner);
        int n = scanner.nextInt();
        int lineLength = line.length();
        int partLength;
        if (lineLength % n != 0) {
            System.out.println("Invalid Input: String size is not divisible by " + n);
            return;
        }
        partLength = lineLength / n;
        for (int i = 0; i < lineLength; i++) {
            if (i % partLength == 0)
                System.out.println();
            System.out.print(line.charAt(i));
        }
    }

    //10.
    public static void reverseString(String line) {
        if ((line == null) || (line.length() <= 1))
            System.out.println(line);
        else {
            System.out.print(line.charAt(line.length() - 1));
            reverseString(line.substring(0, line.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.
        System.out.println(getCharByIndex(scanner));
        //2.
        System.out.println(countOfWords(scanner));
        //3.
        isPalindrome(scanner);
        //4.
        validParentheses(scanner);
        //5.
        isLineContainSequenceOfChars(scanner);
        //6.
        firstLineStartsWithContentsOfAnotherLine(scanner);
        //7.
        firstLineEndWithContentsOfAnotherLine(scanner);
        //8.
        System.out.println(removingDuplicatesFromGivenLine(scanner));
        //9.
        divideString(scanner);
        //10.
        reverseString("ABC");
    }
}

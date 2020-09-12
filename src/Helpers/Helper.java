package Helpers;

import java.util.Scanner;

public class Helper {

    public static void isInputDataValid(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Please enter numeric data: ");
        }
    }

    public static char getMathOperator(Scanner scanner) {
        String operator;
        System.out.println("Enter math operator [+, -, *, /, %]: ");
        operator = scanner.next();
        while (operator.charAt(0) != '+' && operator.charAt(0) != '-' && operator.charAt(0) != '*' &&
                operator.charAt(0) != '/' && operator.charAt(0) != '%') {
            System.out.println("Error! Enter [+, -, *, /, %]: ");
            operator = scanner.next();
        }
        return operator.charAt(0);
    }

    public static void isInputDataInteger(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Enter only natural number: ");
            scanner.next();
        }
    }
}


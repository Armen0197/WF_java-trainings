package day1.data.types.conditions;

import java.text.DecimalFormat;
import java.util.Scanner;

import static Helpers.Helper.isInputDataValid;
import static Helpers.Helper.getMathOperator;

public class DataTypesAndConditions {

    /**
     * 1. Write a program to convert temperature from Fahrenheit to Celsius degree.
     */
    public float fahrenheitToCelsiusConverter(Scanner scanner) {
        System.out.println("Enter the value by Fahrenheit: ");
        isInputDataValid(scanner);
        float fahrenheit = scanner.nextFloat();
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * 2. Write a program that reads a number in inches, converts it to meters.
     */
    public float inchToMeterConverter(Scanner scanner) {
        System.out.println("Enter the inch size: ");
        isInputDataValid(scanner);
        float inch = scanner.nextFloat();
        return inch * 0.0254f;
    }

    /**
     * 3. The force of gravity on the Moon is equal to ~ 17%. Write a program that by
     * entering your weight will count your weight on the Moon.
     */
    public float calculatedWeightOnTheMoon(Scanner scanner) {
        System.out.println("Enter your weight on the Earth: ");
        isInputDataValid(scanner);
        float weight = scanner.nextFloat();
        return weight * 0.17f;
    }

    /**
     * 4. Write a program that will prompt you to enter a natural number and print the
     * multiplication table corresponding to the number on the screen.
     */
    public void createMultiplicationTable(Scanner scanner) {
        System.out.println("Enter the number: ");
        isInputDataValid(scanner);
        int number = scanner.nextInt();
        for (int i = 1; i < 10; ++i) {
            System.out.println(i + " * " + number + " = " + i * number);
        }
    }

    /**
     * 5. Write a calculator that will suggest entering 2 numbers and 1 math operation;
     * Numbers can be int, double, float. Math operation is a char and can be: (+, -, /, *, etc..)
     */
    public void basicCalculator(Scanner scanner) {
        System.out.println("Enter the firs number: ");
        isInputDataValid(scanner);
        double firstNum = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        isInputDataValid(scanner);
        double secondNum = scanner.nextDouble();
        char operator = getMathOperator(scanner);
        switch (operator) {
            case '+':
                System.out.println("Result: " + (firstNum + secondNum));
                break;
            case '-':
                System.out.println("Result: " + (firstNum - secondNum));
                break;
            case '*':
                System.out.println("Result: " + (firstNum * secondNum));
                break;
            case '/':
                try {
                    System.out.println("Result: " + (firstNum / secondNum));
                } catch (ArithmeticException e) {
                    System.out.println("The entered data is incorrect! Check the second number.");
                }
                break;
            case '%':
                System.out.println("Result: " + (firstNum % secondNum));
                break;
        }
    }

    /**
     * 6. Write a program that will suggest you to enter the coordinates of 2 cities and will calculate:
     * a) The distance between 2 cities
     * b) The middle point between 2 cities
     */
    public void distanceAndMiddlePointBetweenTwoCities(Scanner scanner) {
        System.out.println("Enter \"A\" city coordinates: ");
        isInputDataValid(scanner);
        double x1 = scanner.nextDouble();
        isInputDataValid(scanner);
        double y1 = scanner.nextDouble();
        System.out.println("Enter \"B\" city coordinates: ");
        isInputDataValid(scanner);
        double x2 = scanner.nextDouble();
        isInputDataValid(scanner);
        double y2 = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between 2 cities: " + new DecimalFormat("#.#").format(distance) + " km.");
        double x3 = (x1 + x2) / 2;
        double y3 = (y1 + y2) / 2;
        System.out.println("The middle point between 2 cities: X:(" + x3 + "), Y:(" + +y3 + ")");
    }

    /**
     * 7. Take three numbers from the user and print the greatest number.
     */
    public void printTheGreatestNumber(Scanner scanner) {
        System.out.println("Enter the firs number: ");
        isInputDataValid(scanner);
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        isInputDataValid(scanner);
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter the third number: ");
        isInputDataValid(scanner);
        double thirdNumber = scanner.nextDouble();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Greatest number is " + firstNumber);
        } else System.out.println("Greatest number is " + Math.max(secondNumber, thirdNumber));
    }

    /**
     * 8. Write a program that reads a floating-point number and prints "zero" if the number is zero.
     * Otherwise, print "positive" or "negative".
     * Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
     */

    public void floatingPointNumberReader(Scanner scanner) {
        System.out.println("Enter number: ");
        isInputDataValid(scanner);
        double number = scanner.nextDouble();
        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } if (Math.abs(number) < 1) {
            System.out.println("Small");
        } else if (Math.abs(number) > 1_000_000) {
            System.out.println("Large");
        }
    }

    /**
     * 9. Write a Java program that keeps a number from the user
     * and generates an integer between 1 and 7 and displays the name of the weekday.
     */

    public void nameOfTheWeekday(Scanner scanner) {
        System.out.println("Enter weekday number: ");
        isInputDataValid(scanner);
        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong weekday number");
                break;
        }
    }

    /**
     * 10. Write a program which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
     * The program shall always print “bye!” before.
     */
    public void oddOrEven(Scanner scanner) {
        System.out.println("Enter number: ");
        isInputDataValid(scanner);
        double number = scanner.nextDouble();
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else System.out.println("Odd Number");
        System.out.println("bye!");
    }
}
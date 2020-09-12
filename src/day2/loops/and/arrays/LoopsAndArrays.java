package day2.loops.and.arrays;

import java.util.Arrays;
import java.util.Scanner;
import static Helpers.ArraysHelper.*;
import static Helpers.Helper.*;

public class LoopsAndArrays {

    /**
     * 1. Given an array of integers, create another array that have elements of the first
     * array in reversed order
     */
    public void createResetArray(Scanner scanner) {
        int arraySize = setArraySize(scanner);
        int[] inputArray = createArrayIntegers(scanner, arraySize);
        int[] outputArray = new int[arraySize];
        System.out.println("Input: " + Arrays.toString(inputArray));
        for (int i = 0, j = arraySize; i < arraySize; ++i, --j) {
            outputArray[i] = inputArray[j - 1];
        }
        System.out.println("Output: " + Arrays.toString(outputArray));
    }

    /**
     * 2. Write a program that will calculate the arithmetic mean of array elements (type of
     * elements: double, array size: 10).
     */
    public void calculateArithmeticMeanOfArray(Scanner scanner) {
        double sum = 0;
        double[] array = new double[10];
        System.out.println("Enter 10 elements: ");
        for (int i = 0; i < array.length; ++i) {
            isInputDataValid(scanner);
            array[i] = scanner.nextDouble();
            sum += array[i];
        }
        System.out.println("Arithmetic mean of array is " + sum / array.length);
    }

    /**
     * 3. Given 2 arrays, find an element in the first array that doesn’t occur in the second
     * array.
     */
    public void findExtraElement(Scanner scanner) {
        int arraySize;
        arraySize = setArraySize(scanner);
        double[] firstArray = new double[arraySize];
        double[] secondArray = new double[arraySize];
        for (int i = 0; i < arraySize; ++i) {
            System.out.println("Enter [" + i + "] element for first array: ");
            isInputDataValid(scanner);
            firstArray[i] = scanner.nextDouble();
            System.out.println("Enter [" + i + "] element for second array: ");
            isInputDataValid(scanner);
            secondArray[i] = scanner.nextDouble();
        }
        for (int i = 0; i < arraySize; i++) {
            if (firstArray[i] != secondArray[i]) {
                System.out.println("Extra element(s) in first array: " + firstArray[i]);
            }
        }
    }

    /**
     * 4. Given an array of integers and one integer k, find an element that occurs exactly k
     * times.
     */
    public void findElementThatOccursSometimes(Scanner scanner, int arraySize) {
        int[] firstArray = createArrayWithRandomIntData(arraySize);
        System.out.println("Random Array: " + Arrays.toString(firstArray));
        int [] forFrequency = new int [firstArray.length];
        int visited = -1;
        for(int i = 0; i < firstArray.length; ++i){
            int count = 1;
            for(int j = i + 1; j < firstArray.length; ++j){
                if(firstArray[i] == firstArray[j]){
                    count++;
                    forFrequency[j] = visited;
                }
            }
            if(forFrequency[i] != visited)
                forFrequency[i] = count;
        }
        System.out.println("Enter the number you want to check for repeats: ");
        isInputDataInteger(scanner);
        int k = scanner.nextInt();
        for(int i = 0; i < forFrequency.length; i++){
            if(forFrequency[i] == k)
                System.out.println(firstArray[i] + " --> " + forFrequency[i]);
        }
    }

    /**
     * 5. Write a program that will convert the entered number into an array.
     * Input: 187
     * Result: [1, 8, 7]
     */
    public void numberIntoArrayConverter(Scanner scanner) {
        System.out.println("Enter number: ");
        isInputDataInteger(scanner);
        int inputNumber = scanner.nextInt();
        System.out.println("Input: " + inputNumber);
        int countDigits = String.valueOf(inputNumber).length();
        int[] firstArray = new int[countDigits];
        for (int i = countDigits - 1; inputNumber > 0; inputNumber /= 10, --i) {
            firstArray[i] = inputNumber % 10;
        }
        System.out.println("Result: " + Arrays.toString(firstArray));
    }

    /**
     * 6. Represent the given two-dimensional array in the same sequence of a
     * one-dimensional array
     */
    public void representTwoDimensionalArrayToOne(Scanner scanner) {
        int arraySize;
        System.out.println("Enter outer array size: ");
        isInputDataInteger(scanner);
        arraySize = scanner.nextInt();
        System.out.println("Enter inner array size: ");
        isInputDataInteger(scanner);
        int innerArraySize = scanner.nextInt();
        int[][] array = new int[arraySize][innerArraySize];
        for (int i = 0; i < arraySize; ++i) {
            for (int j = 0; j < innerArraySize; ++j) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print("[" + array[i][j] + "] ");
            }
        }
    }

    /**
     * 7. Write a program that will sort the given mass in ascending and descending order.
     * Use Math.random() method for initializing array elements.
     */
    public void sortedArray(Scanner scanner) {
        int arraySize;
        System.out.println("Enter array size: ");
        isInputDataInteger(scanner);
        arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Unsorted array: " + Arrays.toString(array));

        sortingArrayAscending(array);
        System.out.println("Sorted ascending: " + Arrays.toString(array));

        sortingArrayDescending(array);
        System.out.println("Sorted descending: " + Arrays.toString(array));
    }

    /**
     * 8. Write a program that will find and separate the repeating values of two given
     * arrays.
     * Input: [1,45,6, 72] [3,4,45,71,1],
     * Result: [45, 1]
     */

    public void findEqualElements(Scanner scanner) {
        int firstSize;
        int secondSize;
        System.out.println("Enter first array size: ");
        isInputDataInteger(scanner);
        firstSize = scanner.nextInt();
        int[] firstArray = createArrayWithRandomIntData(firstSize);
        System.out.println("Enter second array size: ");
        isInputDataInteger(scanner);
        secondSize = scanner.nextInt();
        int[] secondArray = createArrayWithRandomIntData(secondSize);
        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        for (int i = 0; i < firstSize - 1; i++) {
            for (int j = 0; j < secondSize - 1; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.print("Repeated: [" + firstArray[i] + "]  ");
                }
            }
        }
    }

    /**
     * 9. Write a program that will delete the array element of the given index.
     */
    public void deleteElement(Scanner scanner) {
        int arraySize;
        int index;
        System.out.println("Enter array size: ");
        isInputDataInteger(scanner);
        arraySize = scanner.nextInt();
        int[] array = createArrayWithRandomIntData(arraySize);
        System.out.println("First input array: " + Arrays.toString(array));
        int[] anotherArray = new int[array.length - 1];
        System.out.println("Select the index of the element you want to remove [to 0 from " + (arraySize - 1) + "]: ");
        isInputDataInteger(scanner);
        index = scanner.nextInt();
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = array[i];
        }
        System.out.println("Second array: " + Arrays.toString(anotherArray));
    }

    /**
     * 10. Input a number and the program will print a message a given number of times. The
     * process should continue until the user inputs the number '-1'.
     */
    public void printMessage(Scanner scanner) {
        int count;
        System.out.println("Please enter count of messages: ");
        isInputDataInteger(scanner);
        count = scanner.nextInt();
        while (count != -1) {
            for (int i = 1; i <= count; i++) {
                System.out.println("Message: " + i);
            }
            System.out.println("Please enter count of messages: ");
            System.out.println("For stop enter \"-1\"");
            isInputDataInteger(scanner);
            count = scanner.nextInt();
        }
        System.out.println("Exit!");
    }
}
package Helpers;

import java.util.Scanner;

import static Helpers.Helper.isInputDataInteger;
import static Helpers.Helper.isInputDataValid;


public class ArraysHelper {

    public static int setArraySize(Scanner scanner) {
        System.out.println("Enter array size: ");
        int arraySize;
        isInputDataInteger(scanner);
        arraySize = scanner.nextInt();
        if (arraySize < 0) {
            System.out.println("Error!Array size less than 0");
        }
            return arraySize;
    }

    public static int[] createArrayIntegers(Scanner scanner, int size) {
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; ++i) {
            isInputDataValid(scanner);
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int [] createArrayWithRandomIntData(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void sortingArrayAscending(int[] array) {
        int m;
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                m = array[i];
                array[i] = array[i + 1];
                array[i + 1] = m;
                i = -1;
            }
        }
    }

    public static void sortingArrayDescending(int[] array) {
        int m;
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] < array[i + 1]) {
                m = array[i];
                array[i] = array[i + 1];
                array[i + 1] = m;
                i = -1;
            }
        }
    }
}

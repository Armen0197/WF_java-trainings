package day3.functions.and.objects;

public class FunctionsAndObjects {

    //1.
    public static int[] doublingArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return array;
    }

    //2.1
    public static int sumOfMethodArguments(int first, int second) {
        return first + second;
    }

    public static int sumOfMethodArguments(int first, int second, int third) {
        return first + second + third;
    }

    public static int sumOfMethodArguments(int first, int second, int third, int fourth) {
        return first + second + third + fourth;
    }

    //2.2
    public static int sumOfMethodArguments(int... arg) {
        int sum = 0;
        for (int element : arg) {
            sum += element;
        }
        return sum;
    }

    //3.
    public static double triangleSurface(double a, double b, double c) {
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("You don't have a triangle !!!");
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    //4.1
    public static int[] concatenateTwoArrays(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i];
        }
        for (int i = firstArray.length, j = 0; i < newArray.length; i++, j++) {
            newArray[i] = secondArray[j];
        }
        return newArray;
    }

    //4.2
    public static double sumOfAverageNumbers(int[] firstArray, int[] secondArray) {
        double firstAverageNumber, secondAverageNumber;
        double sum = 0;
        for (int element : firstArray) {
            sum += element;
        }
        firstAverageNumber = sum / firstArray.length;

        sum = 0;
        for (int element : secondArray) {
            sum += element;
        }
        secondAverageNumber = sum / secondArray.length;

        return firstAverageNumber + secondAverageNumber;
    }

    //5.
    public static double increaseTheElementByTenPercent(int[] array, int index) {
        return array[index] + (array[index] * 0.10);
    }

    //6.
    public static int fibonacci(int f) {
        //to see the sequence
        System.out.print(f + ", ");
        if ((f == 0) || (f == 1))
            return f;
        else return fibonacci(f - 1) + fibonacci(f - 2);
    }

    //7.
    public static int factorial(int number) {
        if (number == 1)
            return 1;
        return number * factorial(number - 1);
    }
}

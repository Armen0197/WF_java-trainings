package day_1_data_types_conditions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataTypesAndConditions dataTypesAndConditions = new DataTypesAndConditions();

        //1.
        System.out.println(dataTypesAndConditions.fahrenheitToCelsiusConverter(scanner) + " Celsius(°C)");
        //2.
        System.out.println(dataTypesAndConditions.inchToMeterConverter(scanner) + " Meters");
        //3.
        System.out.println("Your weight on the moon will be: " + dataTypesAndConditions.calculatedWeightOnTheMoon(scanner) + "kg.");
        //4.
        dataTypesAndConditions.createMultiplicationTable(scanner);
        //5.
        dataTypesAndConditions.basicCalculator(scanner);
        //6.
        dataTypesAndConditions.distanceAndMiddlePointBetweenTwoCities(scanner);
        //7.
        dataTypesAndConditions.printTheGreatestNumber(scanner);
        //8.
        dataTypesAndConditions.floatingPointNumberReader(scanner);
        //9.
        dataTypesAndConditions.nameOfTheWeekday(scanner);
        //10.
        dataTypesAndConditions.oddOrEven(scanner);
    }
}
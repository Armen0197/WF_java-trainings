package day3.functions.and.objects.person;

import java.util.Arrays;

public class PersonDemo {
    public static void main(String[] args) {

        //1.
        PersonAPI.inOneWorkplace(DataProvider.persons, DataProvider.companiesNames[(int) (Math.random() * 5)]);
        System.out.println();

        //2.
        PersonAPI.oldestAndYoungestPersons(DataProvider.persons);
        System.out.println();

        //3.
        System.out.println(PersonAPI.getMostRecurringAge(DataProvider.persons) + "\n");

        //4.1
        System.out.println(Arrays.toString(PersonAPI.sortByAge(DataProvider.persons)) + "\n");

        //4.2
        System.out.println(Arrays.toString(PersonAPI.sortByName(DataProvider.persons)) + "\n");

        //4.3
        System.out.println(Arrays.toString(PersonAPI.sortByWorkplace(DataProvider.persons)) + "\n");
    }
}

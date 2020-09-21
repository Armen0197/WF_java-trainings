package day3.functions.and.objects.person;

import java.util.Arrays;

public class DataProvider {
    static final int size = 8;
    static String[] names = {"Olivia", "Emma", "Ava", "Sophia", "Isabella", "Liam", "Noah", "Oliver", "William", "Elijah"};
    static String[] companiesNames = {"SwipeWire", "SecureSmarter", "SaleSmarts", "Industruy", "AgencyStack", "TruscShve"};
    static Person[] persons = new Person[size];

    static {
        persons[0] = new Person((int) (Math.random() * 70), names[(int) (Math.random() * 9)], new Company(companiesNames[(int) (Math.random() * 5)]));
        persons[1] = new Person((int) (Math.random() * 70), names[(int) (Math.random() * 9)], new Company(companiesNames[(int) (Math.random() * 5)]));
        persons[2] = new Person((int) (Math.random() * 70), names[(int) (Math.random() * 9)], new Company(companiesNames[(int) (Math.random() * 5)]));
        persons[3] = new Person((int) (Math.random() * 70), names[(int) (Math.random() * 9)], new Company(companiesNames[(int) (Math.random() * 5)]));
        persons[4] = new Person((int) (Math.random() * 70), names[(int) (Math.random() * 9)], new Company(companiesNames[(int) (Math.random() * 5)]));
        persons[5] = new Person((int) (Math.random() * 70), names[(int) (Math.random() * 9)], new Company(companiesNames[(int) (Math.random() * 5)]));
        persons[6] = new Person((int) (Math.random() * 70), names[(int) (Math.random() * 9)], new Company(companiesNames[(int) (Math.random() * 5)]));
        persons[7] = new Person((int) (Math.random() * 70), names[(int) (Math.random() * 9)], new Company(companiesNames[(int) (Math.random() * 5)]));
        System.out.println("Initialize array: ");
        System.out.println(Arrays.toString(persons) + "\n");
    }
}

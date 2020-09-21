package day3.functions.and.objects.person;

public class PersonAPI {

    //1.
    public static void inOneWorkplace(final Person[] persons, String company) {
        System.out.println("In One Workplace");
        for (Person person : persons) {
            if (person.company.getCompanyName().equals(company)) {
                System.out.println(person.name);
            }
        }
    }

    //2.
    public static void oldestAndYoungestPersons(final Person[] persons) {
        System.out.println("Oldest And Youngest Persons");
        int max = persons[0].age;
        int min = persons[0].age;
        for (int i = 1; i < persons.length; i++) {
            if (persons[i].age > max) {
                max = persons[i].age;
            }
            if (persons[i].age < min) {
                min = persons[i].age;
            }
        }
        for (Person person : persons) {
            if (max == person.age)
                System.out.println(person.name + " the oldest person");
            if (min == person.age)
                System.out.println(person.name + " the youngest person");
        }
    }

    //3.
    public static int getMostRecurringAge(final Person[] persons) {
        System.out.println("Most Recurring Age");
        int mostRecurringAge = 0;
        int[] forFrequency = new int[persons.length];
        int count;
        for (int i = 0; i < persons.length; ++i) {
            count = 0;
            for (int j = i; j < persons.length; ++j) {
                if (persons[i].age == persons[j].age) {
                    count++;
                }
            }
            forFrequency[i] = count;
        }
        int max = forFrequency[0];
        for (int i = 1; i < forFrequency.length; i++) {
            if (forFrequency[i] > max) {
                max = forFrequency[i];
            }
        }
        for (int i = 0; i < forFrequency.length; i++) {
            if (forFrequency[i] == max)
                mostRecurringAge = persons[i].age;
        }
        return mostRecurringAge;
    }

    //4.1
    public static Person[] sortByAge(final Person[] persons) {
        System.out.println("Sort by age");
        Person person;
        for (int i = 0; i < persons.length - 1; ++i) {
            if (persons[i].age > persons[i + 1].age) {
                person = persons[i];
                persons[i] = persons[i + 1];
                persons[i + 1] = person;
                i = -1;
            }
        }
        return persons;
    }

    //4.2
    public static Person[] sortByName(final Person[] persons) {
        System.out.println("Sort by name");
        Person person;
        for (int i = 0; i < persons.length - 1; ++i) {
            if (persons[i].name.compareTo(persons[i + 1].name) > 0) {
                person = persons[i];
                persons[i] = persons[i + 1];
                persons[i + 1] = person;
                i = -1;
            }
        }
        return persons;
    }

    //4.3
    public static Person[] sortByWorkplace(final Person[] persons) {
        System.out.println("Sort by workplace");
        Person person;
        for (int i = 0; i < persons.length - 1; ++i) {
            if (persons[i].company.getCompanyName().compareTo(persons[i + 1].company.getCompanyName()) > 0) {
                person = persons[i];
                persons[i] = persons[i + 1];
                persons[i + 1] = person;
                i = -1;
            }
        }
        return persons;
    }
}
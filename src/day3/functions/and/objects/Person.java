package day3.functions.and.objects;

public class Person {
    int age;
    String name;
    String workplace;

    public Person(int age, String name, String workplace) {
        this.age = age;
        this.name = name;
        this.workplace = workplace;
    }

    //1.
    public static void inOneWorkplace(Person[] persons, String workplace) {
        for (Person person : persons) {
            if (person.workplace.equals(workplace)) {
                System.out.println(person.name);
            }
        }
    }

    //2.
    public static void oldestAndYoungestPerson(Person[] persons) {
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
    public static int getMostRecurringAge(Person[] persons) {
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
    public static Person[] sortByAge(Person[] person) {
        int m;
        for (int i = 0; i < person.length - 1; ++i) {
            if (person[i].age > person[i + 1].age) {
                m = person[i].age;
                person[i].age = person[i + 1].age;
                person[i + 1].age = m;
                i = -1;
            }
        }
        return person;
    }

    //4.2
    public static Person[] sortByName(Person[] person) {
        String name;
        for (int i = 0; i < person.length - 1; ++i) {
            if (person[i].name.compareTo(person[i + 1].name) > 0) {
                name = person[i].name;
                person[i].name = person[i + 1].name;
                person[i + 1].name = name;
                i = -1;
            }
        }
        return person;
    }

    //4.3
    public static Person[] sortByWorkplace(Person[] person) {
        String workplace;
        for (int i = 0; i < person.length - 1; ++i) {
            if (person[i].workplace.compareTo(person[i + 1].workplace) > 0) {
                workplace = person[i].workplace;
                person[i].workplace = person[i + 1].workplace;
                person[i + 1].workplace = workplace;
                i = -1;
            }
        }
        return person;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Workplace: " + workplace;
    }
}

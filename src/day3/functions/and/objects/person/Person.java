package day3.functions.and.objects.person;

public class Person {
    int age;
    String name;
    Company company;

    public Person(int age, String name, Company company) {
        this.age = age;
        this.name = name;
        this.company = company;
    }

    @Override
    public String toString() {
        return "[ Name: " + name + ", Age: " + age + ", Workplace: " + company + " ]  ";
    }
}

package day3.functions.and.objects.person;

public class Company {

    private final String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public boolean equals(Object obj) {
        return this.companyName.equals(((Company) obj).companyName);
    }

    @Override
    public String toString() {
        return companyName;
    }
}

package selfEvaluation_Lab3;

public class Customer {
    private String lastName;
    private String firstName;
    private String Street_HouseNumber;

    public Customer(String lastName, String firstName, String street_HouseNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        Street_HouseNumber = street_HouseNumber;
    }

    public String getLastName(String lastName) {
        return this.lastName;
    }

    public String getFirstName(String firstName) {
        return this.firstName;
    }

    public String getStreet_HouseNumber() {
        return Street_HouseNumber;
    }
}

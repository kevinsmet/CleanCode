package selfEvaluation_Lab3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Customer {
    private String lastName;
    private String firstName;
    private String Street_HouseNumber;
    private LoyaltyCard loyaltyCard;
    private HashMap<LocalDate, List<String>> groceries = new HashMap<>();

    public Customer(String lastName, String firstName, String street_HouseNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        Street_HouseNumber = street_HouseNumber;
    }

    public Customer(String lastName, String firstName, String street_HouseNumber, LoyaltyCard loyaltyCard) {
        this.lastName = lastName;
        this.firstName = firstName;
        Street_HouseNumber = street_HouseNumber;
        this.loyaltyCard = loyaltyCard;
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

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public HashMap<LocalDate, List<String>> getGroceries() {
        return groceries;
    }

    public void doGroceries(List<String> itemList) {
        LocalDate dateOfGroceries = LocalDate.now();
        if (groceries.containsKey(dateOfGroceries)){
            for (String item : itemList) {
                groceries.get(dateOfGroceries).add(item);
            }
        } else {
        groceries.put(dateOfGroceries, itemList);
    }
}}

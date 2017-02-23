package Test_SelfEvaluation_Lab3;


import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import selfEvaluation_Lab3.Customer;
import selfEvaluation_Lab3.LoyaltyCard;
import selfEvaluation_Lab3.Shop;

import java.util.TreeMap;

public class Test_Shop {
    private Customer customer;
    private LoyaltyCard loyaltyCard;
    private TreeMap<Customer,LoyaltyCard> testCustomer = new TreeMap<>();

    @Test
    public void testAddCustomerToMap() throws Exception {

        String lastName = "Smet";
        String firstName = "Kevin";
        String Street_HouseNumber = "Westdijk 14";
        int barcode = 1234;

        customer = customer.getLastName(lastName)+customer.getFirstName(firstName)+customer.getStreet_HouseNumber(Street_HouseNumber);
        loyaltyCard = loyaltyCard.getBarcode(barcode);
        testCustomer.put(customer,loyaltyCard);

        Shop.addCustomerToMap(customer,loyaltyCard);

        Assertions.assertThat()
    }
}

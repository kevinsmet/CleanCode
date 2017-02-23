package selfEvaluation_Lab3;


import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Shop {


    private Customer customer;
    private LoyaltyCard loyaltyCard;

    private TreeMap<Customer,LoyaltyCard> customerCard = new TreeMap<>();


    public void addCustomerToMap(Customer customer, LoyaltyCard loyaltyCard){
        customerCard.put(customer,loyaltyCard);
    }

    public Customer findCustomer (int barCode){
        Customer defaultcustomer = null;
        for (Customer customer: customerCard.keySet()) {
           if (customerCard.get(customer).equals(barCode)) {
               return customer;
           }

                }
        return defaultcustomer;}


}

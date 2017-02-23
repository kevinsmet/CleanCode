package selfEvaluation_Lab3;


import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Shop {

    private static  customerCard;
    private Customer customer;
    private LoyaltyCard loyaltyCard;

    private TreeMap<Customer,LoyaltyCard> customerCard = new TreeMap<>();


    public static void addCustomerToMap(Customer customer, LoyaltyCard loyaltyCard){
        customerCard.put(customer,loyaltyCard);
    }

    public Customer findCustomer (Customer customer, LoyaltyCard loyaltyCard){

    }


}

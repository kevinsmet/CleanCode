package selfEvaluation_Lab3;


import sun.reflect.generics.tree.Tree;

import java.util.*;

public class CustomerRepository {

    public List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public Customer findCustomer (int barCode){
        Customer customerToReturn = null;
        for (Customer customer: customers) {
            int barcodeCustomer = customer.getLoyaltyCard().getBarcode();
           if (barcodeCustomer == barCode) {
               return customer;
           }
                }
        return customerToReturn;
    }

}

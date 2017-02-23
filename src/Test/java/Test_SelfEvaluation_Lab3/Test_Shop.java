package Test_SelfEvaluation_Lab3;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import selfEvaluation_Lab3.Customer;
import selfEvaluation_Lab3.CustomerRepository;
import selfEvaluation_Lab3.LoyaltyCard;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test_Shop {
    private Customer testCus1 = new Customer("Smet", "Kevin", "Westdijk 14", new LoyaltyCard(1234,5));
    private Customer testCus2 = new Customer("Lodewyckx", "Elise", "Gerhoevenstraat 14a", new LoyaltyCard(5678, 3));
    private Customer testCus3 = new Customer("Liekens", "Stijn", "ergens", new LoyaltyCard(91011, 10));

    private CustomerRepository customerRepo = new CustomerRepository();

    private List<String> testGroceries = new ArrayList<>();

    @Before
    public void setUp(){
        customerRepo.addCustomer(testCus1);
        customerRepo.addCustomer(testCus2);
        customerRepo.addCustomer(testCus3);

        testGroceries.add("chocolat");
        testGroceries.add("apple");
        testGroceries.add("pineapple");
    }

    @Test
    public void testAddCustomerToMap()  {
       CustomerRepository customerRepoForThisTest = new CustomerRepository();
       List<Customer> testListCustomers = new ArrayList<>();

       customerRepoForThisTest.addCustomer(testCus1);
       testListCustomers.add(testCus1);

       Assertions.assertThat(customerRepoForThisTest.getCustomers()).isEqualTo(testListCustomers);
    }

    @Test
    public void testFindCustomerByBarcode(){
        Assertions.assertThat(customerRepo.findCustomer(1234)).isEqualTo(testCus1);
    }

    @Test
    public void testIfGroceriesCanBeRetrievedByDay(){
        LocalDate date = LocalDate.now();

        testCus1.doGroceries(testGroceries);

        Assertions.assertThat(testCus1.getGroceries().get(date)).isEqualTo(testGroceries);
    }

    @Test
    public void testIfGroceriesCanBeAddedMultipleTimesPerDay(){
        LocalDate date = LocalDate.now();
        List<String> testGroceries2 = new ArrayList<>();
        List<String> fullDayGroceries = new ArrayList<>();

        testGroceries2.add("banana");
        testGroceries2.add("candy");

        fullDayGroceries.add("chocolat");
        fullDayGroceries.add("apple");
        fullDayGroceries.add("pineapple");
        fullDayGroceries.add("banana");
        fullDayGroceries.add("candy");

        testCus1.doGroceries(testGroceries);
        testCus1.doGroceries(testGroceries2);

        Assertions.assertThat(testCus1.getGroceries().get(date)).isEqualTo(fullDayGroceries);
    }
}

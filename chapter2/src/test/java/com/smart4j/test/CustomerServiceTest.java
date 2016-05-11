package com.smart4j.test;

import com.smart4j.model.Customer;
import com.smart4j.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;

import java.util.List;

/**
 * Created by miraclewong on 16/5/11.
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Before
    public void init(){
    }

    public void getCustomerListTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2, customerList);
    }
}

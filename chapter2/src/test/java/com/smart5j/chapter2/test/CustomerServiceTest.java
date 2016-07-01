package com.smart5j.chapter2.test;

import com.smart5j.chapter2.helper.DatabaseHelper;
import com.smart5j.chapter2.model.Customer;
import com.smart5j.chapter2.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by miraclewong on 16/6/29.
 */
public class CustomerServiceTest {
    
    private  final CustomerService customerService;

    public CustomerServiceTest() {
        this.customerService =new CustomerService();
    }
    
    @Before
    public void init(){
        // TODO: 16/6/30
    }

    @Test
    public void getCustomerListTest() throws Exception{
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2,customerList.size());
    }


    @Test
    public void getCustomerTest() throws  Exception{
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws  Exception{
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "customer001");
        fieldMap.put("contact", "John");
        fieldMap.put("telephone ", "15827198245");
        fieldMap.put("name", "customer001");
        boolean result = customerService.createCustomer(fieldMap);

        Assert.assertTrue(!result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact", "Eric");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(!result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }

    @Test
    public void connectJDBCTest() throws Exception{
        DatabaseHelper databaseHelper = new DatabaseHelper();
        databaseHelper.getConnection();
    }


}

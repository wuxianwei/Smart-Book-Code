package com.smart5j.chapter2.service;

import com.smart5j.chapter2.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by miraclewong on 16/6/29.
 *
 * 提供客户数据服务
 */
public class CustomerCreateService {

    // 获取客户的列表
    public List<Customer> getCustomerList(String keyword) {
        // TODO: 16/6/29
        return  null;
    }
    // 获取客户的列表
    public List<Customer> getCustomerList() {
        // TODO: 16/6/29
        List<Customer> list = new ArrayList<Customer> ();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        list.add(customer1);
        list.add(customer2);
        return  list;
    }
    // 获取客户
    public Customer getCustomer(long id){
        // TODO: 16/6/29
        return null;
    }

    // 创建客户
    public boolean createCustomer(Map<String, Object> fieldMap) {
        // Todo
        return false;
    }
    // 更新客户
    public boolean updateCustomer(long id, Map<String, Object> fieldMap){
        // TODO: 16/6/29
        return false;
    }

    // 删除客户
    public boolean deleteCustomer(long id){
        // TODO: 16/6/29
        // TODO: 16/6/30  
        return true;
    }
}

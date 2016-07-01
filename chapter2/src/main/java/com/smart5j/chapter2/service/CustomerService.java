package com.smart5j.chapter2.service;

import com.smart5j.chapter2.helper.DatabaseHelper;
import com.smart5j.chapter2.model.Customer;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by miraclewong on 16/6/29.
 *
 * 提供客户数据服务
 */
public class CustomerService {


    public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);



    // 获取客户的列表
    public List<Customer> getCustomerList(String keyword) {
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }
    // 获取客户的列表
    public List<Customer> getCustomerList() {
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
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

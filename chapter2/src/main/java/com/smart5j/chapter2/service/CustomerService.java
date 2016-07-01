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

        Connection connection = null;


        try{
            List<Customer> customerList = new ArrayList<Customer>();
            String sql = "select * from customer";
            connection = DatabaseHelper.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Customer customer = new Customer();
                customer.setId(resultSet.getLong("id"));
                customer.setName(resultSet.getString("name"));
                customer.setContact(resultSet.getString("contact"));
                customer.setTelephone(resultSet.getString("telephone"));
                customer.setEmail(resultSet.getString("email"));
                customer.setRemark(resultSet.getString("remark"));

                customerList.add(customer);
            }

            return customerList;
        } catch (SQLException e){
            LOGGER.error("excute sql failure",e);
        } finally {
            DatabaseHelper.closeConnection(connection);
        }
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

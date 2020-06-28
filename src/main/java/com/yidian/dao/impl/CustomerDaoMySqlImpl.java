package com.yidian.dao.impl;

import com.yidian.dao.CustomerDao;
import org.springframework.stereotype.Repository;
import com.yidian.model.Customer;
import java.util.List;

@Repository(value = "customerMysqlDao")
public class CustomerDaoMySqlImpl implements CustomerDao {

    public void save() {
        System.out.println("执行了CustomerDaoMySqlImpl()方法");
    }

    public List<Customer> findAll() {
        return null;
    }
}

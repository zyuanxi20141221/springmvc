package com.yidian.dao.impl;

import com.yidian.dao.CustomerDao;
import com.yidian.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "customerOracleDao")
public class CustomerDaoOracleImpl implements CustomerDao {

    public void save() {
        System.out.println("执行了CustomerDaoOracleImpl的save()方法");
    }

    public List<Customer> findAll() {
        return null;
    }
}

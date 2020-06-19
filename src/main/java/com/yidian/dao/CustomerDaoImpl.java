package com.yidian.dao;

import org.springframework.stereotype.Repository;
import com.yidian.model.Customer;
import java.util.List;

@Repository(value = "customerDao")
public class CustomerDaoImpl implements CustomerDao {

    public void save() {
        System.out.println("执行了CustomerDaoImpl的save()方法");
    }

    public List<Customer> findAll() {
        return null;
    }
}

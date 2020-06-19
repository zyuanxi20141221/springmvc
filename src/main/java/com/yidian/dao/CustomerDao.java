package com.yidian.dao;

import com.yidian.model.Customer;
import java.util.List;

public interface CustomerDao {

    public void save();

    public List<Customer> findAll();
}

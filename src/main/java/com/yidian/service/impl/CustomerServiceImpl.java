package com.yidian.service.impl;

import com.yidian.CustomerService;
import com.yidian.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    @Qualifier(value = "customerOracleDao")
    private CustomerDao customerDao;

    public void save() {
        customerDao.save();
    }
}

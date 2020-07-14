package com.lambda.orders.services;

import com.lambda.orders.models.Customer;
import com.lambda.orders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerServices {
    @Autowired
    private CustomerRepository customerrepos;

    @Override
    public Customer save(Customer customer) {
        return customerrepos.save(customer);
    }
}
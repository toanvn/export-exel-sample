package clc.tool.service;

import clc.tool.domain.Customer;

import java.util.List;

/**
 * Created by qup on 11/22/16.
 */
public interface CustomerService {
    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}

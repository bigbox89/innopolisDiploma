package com.gitlab.ufapetr.services;

import com.gitlab.ufapetr.forms.CustomerForm;
import com.gitlab.ufapetr.models.Customer;

import java.util.List;

public interface CustomersService {
    void addCustomer(CustomerForm form);
    List<Customer> getAllCustomers();

    void deleteCustomer(Integer customerId);

    Customer getCustomer(Integer customer_id);

    void updateCustomer(Integer customerId, CustomerForm form);
}

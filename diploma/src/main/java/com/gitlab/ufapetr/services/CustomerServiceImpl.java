package com.gitlab.ufapetr.services;

import com.gitlab.ufapetr.forms.CustomerForm;
import com.gitlab.ufapetr.models.Customer;
import com.gitlab.ufapetr.models.Product;
import com.gitlab.ufapetr.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class CustomerServiceImpl implements CustomersService {
    private final CustomersRepository customersRepository;

    @Autowired
    public CustomerServiceImpl(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    @Override
    public void addCustomer(CustomerForm form) {

        Customer customer = Customer.builder()
                .name(form.getName())
                .build();

        customersRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return  customersRepository.findAll();
    }

    @Override
    public void deleteCustomer(Integer customerId) {
         customersRepository.deleteById(customerId);
    }

    @Override
    public Customer getCustomer(Integer customer_id) {

        return customersRepository.getById(customer_id);
    }

    @Override
    public void updateCustomer(Integer customerId, CustomerForm form) {
        Customer customer = customersRepository.getById(customerId);
        customer.setName(form.getName());
        customersRepository.save(customer);
    }
}

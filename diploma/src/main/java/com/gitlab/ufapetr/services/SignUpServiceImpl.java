package com.gitlab.ufapetr.services;

import com.gitlab.ufapetr.forms.SignUpForm;
import com.gitlab.ufapetr.models.Customer;
import com.gitlab.ufapetr.repositories.CustomersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SignUpServiceImpl implements SignUpService{
    private final PasswordEncoder passwordEncoder;
    private final CustomersRepository customersRepository;
    @Override
    public void addUser(SignUpForm form) {
        Customer customer = Customer.builder()
                .name(form.getName())
                .nick(form.getNick())
                .role(Customer.Role.USER)
                .password(passwordEncoder.encode(form.getPassword()))
                .build();
        customersRepository.save(customer);
    }
}

package com.gitlab.ufapetr.security.details;

import com.gitlab.ufapetr.models.Customer;
import com.gitlab.ufapetr.repositories.CustomersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerDetailsServiceImpl implements UserDetailsService {
    private final  CustomersRepository customersRepository ;

    @Override
    public UserDetails loadUserByUsername(String nick) throws UsernameNotFoundException {
        Customer customer = customersRepository.findByNick(nick).orElseThrow(()-> new UsernameNotFoundException("User not found"));
        CustomersDetailsImpl customersDetails = new CustomersDetailsImpl(customer);
        return customersDetails;
    }
}

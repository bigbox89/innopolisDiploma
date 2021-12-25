package com.gitlab.ufapetr.security.details;

import com.gitlab.ufapetr.models.Customer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class CustomersDetailsImpl implements UserDetails {

    private final Customer customer;

    public CustomersDetailsImpl(Customer customer) {
        this.customer = customer;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String role = customer.getRole().toString();
        System.out.println("Login as " + role);
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role);

        return Collections.singleton(authority);
    }

    @Override
    public String getPassword() {
        return this.customer.getPassword();
    }

    @Override
    public String getUsername() {
        return this.customer.getNick();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

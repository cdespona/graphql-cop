package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.model.Address;
import com.example.graphql.model.Phone;
import com.example.graphql.model.User;
import com.example.graphql.repository.AddressRepository;
import com.example.graphql.repository.PhoneRepository;
import com.example.graphql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    private AddressRepository addressRepository;
    private PhoneRepository phoneRepository;
    private UserRepository userRepository;

    @Autowired
    public QueryResolver(AddressRepository addressRepository, PhoneRepository phoneRepository, UserRepository userRepository) {
        this.addressRepository = addressRepository;
        this.phoneRepository = phoneRepository;
        this.userRepository = userRepository;
    }

    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Iterable<Phone> findAllPhones() {
        return phoneRepository.findAll();
    }

    public Iterable<Address> findAllAddresses() {
        return addressRepository.findAll();
    }

    public long countUsers() {
        return userRepository.count();
    }

    public long countAddresses() {
        return addressRepository.count();
    }

    public long countPhones() {
        return phoneRepository.count();
    }
}

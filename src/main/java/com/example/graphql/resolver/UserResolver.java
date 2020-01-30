package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.model.Address;
import com.example.graphql.model.Phone;
import com.example.graphql.model.User;
import com.example.graphql.repository.AddressRepository;
import com.example.graphql.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserResolver implements GraphQLResolver<User> {
    @Autowired
    private PhoneRepository phoneRepository;

    @Autowired
    private AddressRepository addressRepository;

    public UserResolver(PhoneRepository phoneRepository, AddressRepository addressRepository) {
        this.phoneRepository = phoneRepository;
        this.addressRepository = addressRepository;
    }

    public Phone phone(User user) {
        return phoneRepository.findById(user.getPhone().getId()).orElseThrow(null);
    }

    public Address address(User user) {
        return addressRepository.findById(user.getAddress().getId()).orElseThrow(null);
    }
}

package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.model.Address;
import com.example.graphql.model.Phone;
import com.example.graphql.model.User;
import com.example.graphql.repository.AddressRepository;
import com.example.graphql.repository.PhoneRepository;
import com.example.graphql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {

    private AddressRepository addressRepository;
    private PhoneRepository phoneRepository;
    private UserRepository userRepository;


    @Autowired
    public MutationResolver(AddressRepository addressRepository, PhoneRepository phoneRepository, UserRepository userRepository) {
        this.addressRepository = addressRepository;
        this.phoneRepository = phoneRepository;
        this.userRepository = userRepository;
    }

    public User createUser(String name, String firstName, String email, Address address, Phone phone) {
        User user = new User();
        user.setName(name);
        user.setFirst_name(firstName);
        user.setEmail(email);
        user.setAddress(address);
        user.setPhone(phone);

        userRepository.save(user);
        return user;
    }

    public Address createAddress(String addressName, String zp, String city, String country) {
        Address address = new Address();
        address.setAddress(addressName);
        address.setZp(zp);
        address.setCity(city);
        address.setCountry(country);

        addressRepository.save(address);
        return address;
    }

    public Phone createPhone(String phoneNumber, String countryCode) {
        Phone phone = new Phone();
        phone.setPhone(phoneNumber);
        phone.setCountry_code(countryCode);

        phoneRepository.save(phone);
        return phone;
    }

    public User updateUser(int id, String name, String firstName, String email, Address address, Phone phone) {
        User user = new User();
        user.setName(name);
        user.setFirst_name(firstName);
        user.setEmail(email);
        user.setAddress(address);
        user.setPhone(phone);

        userRepository.save(user);
        return user;
    }

    public Address updateAddress(int id, String addressName, String zp, String city, String country) {
        Address address = new Address();
        address.setAddress(addressName);
        address.setZp(zp);
        address.setCity(city);
        address.setCountry(country);

        addressRepository.save(address);
        return address;
    }

    public Phone updatePhone(int id, String phoneNumber, String countryCode) {
        Phone phone = new Phone();
        phone.setPhone(phoneNumber);
        phone.setCountry_code(countryCode);

        phoneRepository.save(phone);
        return phone;
    }

    public boolean deleteUser(Long id) {
        userRepository.deleteById(id);
        return true;
    }

    public boolean deleteAddress(Long id) {
        addressRepository.deleteById(id);
        return true;
    }

    public boolean deletePhone(Long id) {
        phoneRepository.deleteById(id);
        return true;
    }
}

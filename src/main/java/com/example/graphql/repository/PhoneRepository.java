package com.example.graphql.repository;


import com.example.graphql.model.Phone;
import com.example.graphql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
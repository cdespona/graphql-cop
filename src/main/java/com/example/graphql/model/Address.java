package com.example.graphql.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String address;
    private String zp;
    private String city;
    private String country;


    public Address(Long id){
        this.id = id;
    }
}
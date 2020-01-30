package com.example.graphql.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User {

    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String first_name;
    private String email;

    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="idAddress")
    private Address address;

    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="idPhone")
    private Phone phone;
}
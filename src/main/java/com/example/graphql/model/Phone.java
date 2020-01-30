package com.example.graphql.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Entity
@Table(name = "PHONE")
public class Phone {

    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String phone;
    private String country_code;

    public Phone(Long id) {
        this.id = id;
    }
}
package com.shoppingapp.shoppingapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String addressId;
    private String streetNo;
    private String buildingName;
    private String city;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> state= new ArrayList<>();
    private String country;
    private String pincode;
}

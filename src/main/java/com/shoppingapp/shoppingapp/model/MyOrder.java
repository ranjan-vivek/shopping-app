package com.shoppingapp.shoppingapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class MyOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;
    private String orderStatus;
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Products> productsList;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    private LocalDateTime date;
}

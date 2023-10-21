package com.shoppingapp.shoppingapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productId;
    private String productName;
    private Double price;
    private String colour;
    private String dimmension;
    private String specification;
    private String manufaturer;
    private Integer quantity;
    private Category category;
    public enum Category{
        MOBILE,BOOKS,CLOTHS,FRUITS,VEGETABLES
    }
}

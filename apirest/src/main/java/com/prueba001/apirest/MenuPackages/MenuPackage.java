package com.prueba001.apirest.MenuPackages;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class MenuPackage {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String title;
    private String description;
    private Double price;
    private String imageUrl;
    private Long numberOfPeople;
    private Long stock;
    private String category;
    private String tags;
    private String aditionalServices;
}

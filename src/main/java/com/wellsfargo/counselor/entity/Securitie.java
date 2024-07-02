package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Securitie {

    @Id
    @GeneratedValue()
    private long securitieId;

    @Column(nullable = false)
    private String Name;
    @Column(nullable = false)
    private String Category;
    @Column(nullable = false)
    private Date PurchaseDate;
    @Column(nullable = false)
    private double PurchasePrice;
    @Column(nullable = false)
    private int Quantity;
    @Column(nullable = false)
    @ManyToOne
    private Portfolio portfolio;
}

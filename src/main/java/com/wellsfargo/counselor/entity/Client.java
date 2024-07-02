package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String Name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    @ManyToOne
    private Advisor advisor;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ArrayList<Portfolio> portfolios;

    public Client() {
    }

    public Client(String name, String address, String phone, String email, Advisor advisor) {
        Name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.advisor = advisor;
    }

    public long getClientId() {
        return clientId;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}

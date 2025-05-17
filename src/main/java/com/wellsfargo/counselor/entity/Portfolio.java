package com.yourpackage.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    private String name;
    private String createdAt;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    public Portfolio() {}

    public Portfolio(String name, String createdAt, Client client) {
        this.name = name;
        this.createdAt = createdAt;
        this.client = client;
    }

    // Getters and Setters
}

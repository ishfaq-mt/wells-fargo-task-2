package com.yourpackage.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String name;
    private String email;
    private String createdAt;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio portfolio;

    public Client() {}

    public Client(String name, String email, String createdAt, FinancialAdvisor advisor) {
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
        this.advisor = advisor;
    }

    // Getters and Setters
}

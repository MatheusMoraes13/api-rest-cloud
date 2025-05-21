package me.dio.api_rest_cloud.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "tab_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

}

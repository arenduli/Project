package org.example.model;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "code", unique = true, length = 10)
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "price_eur")
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal priceEUR;

    @Column(name = "price_usd")
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal priceUSD;

    @Column(name = "description")
    private String description;

    @Column(name = "is_available")
    private Boolean isAvailable;

    public Product() {

    }

    public Product(String code, String name, BigDecimal priceEUR, BigDecimal priceUSD, String description, Boolean isAvailable) {
        super();
        this.code = code;
        this.name = name;
        this.priceEUR = priceEUR;
        this.priceUSD = priceUSD;
        this.description = description;
        this.isAvailable = isAvailable;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPriceEUR() {
        return priceEUR;
    }

    public void setPriceEUR(BigDecimal priceEUR) {
        this.priceEUR = priceEUR;
    }

    public BigDecimal getPriceUSD() {
        return priceUSD;
    }

    public void setPriceUSD(BigDecimal priceUSD) {
        this.priceUSD = priceUSD;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
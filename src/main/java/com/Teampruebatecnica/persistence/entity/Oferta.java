package com.Teampruebatecnica.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="ofertas",schema = "oferta")
public class Oferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "offerse_id")
    private long offerse_id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price_value")
    private double price_value;

    public long getOfferse_id() {
        return offerse_id;
    }

    public void setOfferse_id(long offerse_id) {
        this.offerse_id = offerse_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice_value() {
        return price_value;
    }

    public void setPrice_value(double price_value) {
        this.price_value = price_value;
    }
}

package com.Teampruebatecnica.persistence.entity;

import javax.persistence.*;

//Notaciones para indicar que es el pojo de la tabla oferta del mapeo objeto relacional
@Entity
@Table(name="ofertas",schema = "oferta")
//Clase que hace como pojo
public class Oferta {

    //Id de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "offerse_id")
    private long offerse_id;
    //Atributo que hace el mapeo de la columna name
    @Column(name = "name")
    private String name;
    //Atributo que hace el mapeo de la columna description
    @Column(name = "description")
    private String description;
    //Atributo que hace el mapeo de la columna name
    @Column(name = "price_value")
    //Atributo que hace el mapeo de la price_value
    private double price_value;


    /***
     * Get Offerse
     * **/
    public long getOfferse_id() {
        return offerse_id;
    }

    /***
     * Set Offerse
     * **/
    public void setOfferse_id(long offerse_id) {
        this.offerse_id = offerse_id;
    }
    /***
     * Get Name
     * **/

    public String getName() {
        return name;
    }

    /***
     * Set Name
     * **/

    public void setName(String name) {
        this.name = name;
    }

    /***
     * Get Description
     * **/
    public String getDescription() {
        return description;
    }

    /***
     * Set Description
     * **/
    public void setDescription(String description) {
        this.description = description;
    }

    /***
     * Get Price
     * **/
    public double getPrice_value() {
        return price_value;
    }
    /***
     * Ser Price
     * **/
    public void setPrice_value(double price_value) {
        this.price_value = price_value;
    }
}

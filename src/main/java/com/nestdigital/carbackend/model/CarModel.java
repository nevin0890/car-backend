package com.nestdigital.carbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class CarModel {
    @Id
    @GeneratedValue

    private int id;
    private String carname;
    private String carcompany;
    private int carprice;
    private String colour;

    public CarModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarcompany() {
        return carcompany;
    }

    public void setCarcompany(String carcompany) {
        this.carcompany = carcompany;
    }

    public int getCarprice() {
        return carprice;
    }

    public void setCarprice(int carprice) {
        this.carprice = carprice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public CarModel(int id, String carname, String carcompany, int carprice, String colour) {
        this.id = id;
        this.carname = carname;
        this.carcompany = carcompany;
        this.carprice = carprice;
        this.colour = colour;
    }
}

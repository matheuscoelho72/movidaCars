package com.example.movidaCars.model;

import jakarta.persistence.*;

@Entity
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String model;

    @Column
    private String color;

    @Column
    private String licensePlate;

    @Column
    private Integer yearCar;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Integer getYearCar() {
        return yearCar;
    }

    public void setYearCar(Integer yearCar) {
        this.yearCar = yearCar;
    }
}

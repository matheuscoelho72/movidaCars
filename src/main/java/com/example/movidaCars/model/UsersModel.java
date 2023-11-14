package com.example.movidaCars.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    private String login;
    @Column
    private String password;
    @Column (nullable = true)
    private String firstName;
    @Column (nullable = true)
    private String lastName;
    @Column (nullable = true)
    private String email;
    @Column (nullable = true)
    private Date birthday;
    @Column (nullable = true)
    private String phone;
   /* @OneToMany
    private List<CarroModel> carros;

    */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    /*
    public List<CarroModel> getCarros() {
        return carros;
    }

    public void setCarros(List<CarroModel> carros) {
        this.carros = carros;
    }
     */



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersModel that = (UsersModel) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

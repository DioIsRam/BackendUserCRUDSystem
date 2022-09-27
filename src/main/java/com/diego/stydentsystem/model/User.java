package com.diego.stydentsystem.model;

import javax.persistence.*;

/**
 *Clase Users del modelo
 *
 * @author diego israel ramirez martinez
 **/

@Entity
@Table(name="user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
    private String password;

    public User() {
    }

    /**
     * metodo de modelo getId
     *
     * @return id del modelo
     **/

    public Long getId() {
        return id;
    }

    /**
     * metodo de modelo setId
     *
     * @param id valor del modelo
     **/

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * metodo de modelo getUser
     *
     * @return userName del modelo
     **/

    public String getUserName() {
        return userName;
    }

    /**
     * metodo de modelo setUser
     *
     * @param userName valor del modelo
     **/

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * metodo de modelo getEmail
     *
     * @return email del modelo
     **/
    public String getEmail() {
        return email;
    }

    /**
     * metodo de modelo setEmail
     *
     * @param email valor del modelo
     **/

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * metodo de modelo getPassword
     *
     * @return password del modelo
     **/
    public String getPassword() {
        return password;
    }

    /**
     * metodo de modelo setPassword
     *
     * @param password valor del modelo
     **/
    public void setPassword(String password) {
        this.password = password;
    }
}
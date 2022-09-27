package com.diego.stydentsystem.service;

import com.diego.stydentsystem.model.User;

import java.util.List;
import java.util.Optional;

/**
 *User Service, define la clase de logica de negocio
 *
 * @author diego israel ramirez martinez
 **/

public interface UserService {
    /**
     * Metodo que obtieene todas las entidades
     *
     * @return List
     * **/
    public List<User> getAllUsers();

    /**
     * Metodo que obtiene una entidad
     * @param Id identificador de entidad
     * @return User opcional
     *
     * **/
    public Optional<User> getUserById(Long Id);

    /**
     * Metodo que guarda una entidad
     * @param user entidad
     * @return User
     *
     * **/
    public User saveUser(User user);

    /**
     * Metodo que elimina una entidad
     * @param id identificador de la  entidad
     * @return String
     *
     * **/
    public String deleteById(Long id);
}

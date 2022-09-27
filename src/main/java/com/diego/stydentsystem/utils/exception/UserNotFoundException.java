package com.diego.stydentsystem.utils.exception;
/**
 * Clase para el manejo de Errores
 * @author diego ramirez
 * */
public class UserNotFoundException extends RuntimeException{
    /**
     * metodo de Excepcion
     * @param id
    * */
    public UserNotFoundException(Long id){
        super("Could not found the user with id" + id);
    }
}

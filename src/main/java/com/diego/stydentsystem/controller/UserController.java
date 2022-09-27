package com.diego.stydentsystem.controller;

import com.diego.stydentsystem.utils.exception.UserNotFoundException;
import com.diego.stydentsystem.model.User;
import com.diego.stydentsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
/**
 * Controlador
 * @author diego ramirez
* **/
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * Agrega un Usuario
     * @param newUser
     * @return String
     */

    @PostMapping("/add")
    public String add(@RequestBody User newUser){
        userService.saveUser(newUser);
        return "El nuevo usuario ha sido agregado";
    }
    /**
     * Obtene la lista de Usuarios
     *
     * @return userService.getAllUsers()
     */

    @GetMapping("/list")
    public List<User> getAllStudents(){
        return userService.getAllUsers();
    }

    /**
     * Obtiene a un usuario por su Id
     * @param id
     * @return userService.getUserById(id);
     */

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    /**
     * Actualiza a un usuario por su Id
     * @param id
     * @param newUser
     * @return userService.getUserById(id);
     */

    @PutMapping("update/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id){
        return userService.getUserById(id).map(user -> {
            user.setUserName(newUser.getUserName());
            user.setEmail(newUser.getEmail());
            return userService.saveUser(user);
        }).orElseThrow(()->new UserNotFoundException(id));
     }

    /**
     * Elimina a un usuario por su Id
     * @param id
     * @return userService.deleteById(id);
     */
    @DeleteMapping("delete/{id}")
    String deleteUser(@PathVariable Long id){
        return userService.deleteById(id);
    }


}

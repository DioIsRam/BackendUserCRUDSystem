package com.diego.stydentsystem.repository;

import com.diego.stydentsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRespository  Repositorio para el almacenamiento de {User}
 * @author diego ramirez
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}

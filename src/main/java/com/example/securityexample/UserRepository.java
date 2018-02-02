package com.example.securityexample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Emina on 4/22/2017.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAll();

    List<User> findByIduser(@Param("iduser") long iduser);

    List<User> findByEmailContaining(@Param("email") String email);

    User findByName(@Param("name") String name);

    List<User> findByOrderByProfilescoreDesc();



}

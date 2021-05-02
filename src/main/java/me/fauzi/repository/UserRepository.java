package me.fauzi.repository;

import me.fauzi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;


/**
 * Created by fauzi on 01/05/2021.
 */
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAll(Pageable page);
}
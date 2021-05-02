package me.fauzi.service;

import me.fauzi.model.User;
import me.fauzi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by fauzi on 01/05/2021.
 */

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userReporsitory;

    //Menampilkan seluruh user
    public List<User> listUser(Pageable page){
        return userReporsitory.findAll(page);
    }

    //Menambah user
    public void saveUser(User user) {
        userReporsitory.save(user);
    }

    //get user by ID
    public User getUser(String id){
        return userReporsitory.findById(id).get();
    }

    //hapus user
    public void deleteUser(String id) {
        userReporsitory.deleteById(id);
    }
}

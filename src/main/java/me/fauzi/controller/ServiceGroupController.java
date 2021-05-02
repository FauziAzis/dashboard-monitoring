package me.fauzi.controller;

import me.fauzi.model.ServiceGroupModel;
import me.fauzi.repository.ServiceGroupRepository;
import me.fauzi.service.ServiceGroupImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fauzi on 02/05/2021.
 */

@RestController
@RequestMapping("/services/group")
public class ServiceGroupController {
    @Autowired
    ServiceGroupImpl serviceGroupImpl;

    @GetMapping("/")
    public Page<ServiceGroupModel> list(Pageable page){
        return serviceGroupImpl.listAll(page);

    }
}

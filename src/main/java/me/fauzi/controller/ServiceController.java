package me.fauzi.controller;

import me.fauzi.model.ServiceModel;
import me.fauzi.service.ServiceImpl;
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
@RequestMapping("/services")
public class ServiceController {
    @Autowired
    ServiceImpl serviceImpl;

    @GetMapping("/")
    public Page<ServiceModel> list(Pageable page){
        return serviceImpl.listAllService(page);
    }

}

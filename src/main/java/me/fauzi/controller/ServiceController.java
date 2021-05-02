package me.fauzi.controller;

import me.fauzi.model.ServiceModel;
import me.fauzi.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fauzi on 02/05/2021.
 */

@RestController
@RequestMapping("/services")
public class ServiceController {
    @Autowired
    ServiceImpl serviceImpl;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Page<ServiceModel> list(Pageable page){
        return serviceImpl.listAll(page);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody ServiceModel serviceModel) {
        serviceImpl.saveService(serviceModel);
    }

}

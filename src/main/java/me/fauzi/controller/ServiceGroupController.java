package me.fauzi.controller;

import me.fauzi.model.ServiceGroupModel;
import me.fauzi.service.ServiceGroupImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fauzi on 02/05/2021.
 */

@RestController
@RequestMapping("/services/group")
public class ServiceGroupController {
    @Autowired
    ServiceGroupImpl serviceGroupImpl;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Page<ServiceGroupModel> list(Pageable page){
        return serviceGroupImpl.listAll(page);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody ServiceGroupModel serviceGroup) {
        serviceGroupImpl.saveGroup(serviceGroup);
    }

}

package me.fauzi.controller;

import me.fauzi.model.ServiceView;
import me.fauzi.repository.ServiceViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/view")
public class ServiceViewController {
    @Autowired
    ServiceViewRepository serviceViewRepository;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Page<ServiceView> list(Pageable page){

        String Total = "TOTAL";

        ServiceView sv = new ServiceView();
        sv.setTotal(Total);
        
        return serviceViewRepository.findAll(page);
    }

}

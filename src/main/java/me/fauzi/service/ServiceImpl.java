package me.fauzi.service;

import me.fauzi.model.ServiceModel;
import me.fauzi.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by fauzi on 02/05/2021.
 */

@Service
@Transactional
public class ServiceImpl {

    @Autowired
    private ServiceRepository serviceRepository;

    public Page<ServiceModel> listAll(Pageable page){
        return serviceRepository.findAll(page);
    }

    public  void saveService(ServiceModel service){
        serviceRepository.save(service);
    }

}

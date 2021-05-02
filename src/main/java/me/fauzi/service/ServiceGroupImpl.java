package me.fauzi.service;

import me.fauzi.model.ServiceGroupModel;
import me.fauzi.repository.ServiceGroupRepository;
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
public class ServiceGroupImpl {

    @Autowired
    private ServiceGroupRepository serviceGroupRepository;

    public Page<ServiceGroupModel> listAll(Pageable page){
        return serviceGroupRepository.findAll(page);
    }

    private void saveServiceGroup(ServiceGroupModel serviceGroup){
        serviceGroupRepository.save(serviceGroup);
    }

}

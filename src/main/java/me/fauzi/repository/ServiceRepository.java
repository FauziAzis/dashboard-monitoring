package me.fauzi.repository;

import me.fauzi.model.ServiceModel;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by fauzi on 02/05/2021.
 */
public interface ServiceRepository extends PagingAndSortingRepository<ServiceModel, String>{

}

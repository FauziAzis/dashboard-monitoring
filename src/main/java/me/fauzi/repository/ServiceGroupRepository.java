package me.fauzi.repository;

import me.fauzi.model.ServiceGroupModel;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by fauzi on 02/05/2021.
 */
public interface ServiceGroupRepository extends PagingAndSortingRepository<ServiceGroupModel, String> {
}
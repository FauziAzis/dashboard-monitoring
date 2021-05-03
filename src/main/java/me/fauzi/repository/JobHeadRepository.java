package me.fauzi.repository;

import me.fauzi.model.JobHeadModel;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JobHeadRepository extends PagingAndSortingRepository<JobHeadModel,String> {
}

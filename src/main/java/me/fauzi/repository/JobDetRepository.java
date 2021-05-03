package me.fauzi.repository;

import me.fauzi.model.JobDetModel;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JobDetRepository extends PagingAndSortingRepository<JobDetModel, String> {
}

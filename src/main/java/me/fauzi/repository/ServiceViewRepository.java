package me.fauzi.repository;

import me.fauzi.model.ServiceView;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ServiceViewRepository extends JpaRepository<ServiceView, String> {
}

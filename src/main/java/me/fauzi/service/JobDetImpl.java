package me.fauzi.service;


import me.fauzi.model.JobDetModel;
import me.fauzi.repository.JobDetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class JobDetImpl {

    @Autowired
    private JobDetRepository jobDetRepository;

    public Page<JobDetModel> listAll(Pageable page){
        return jobDetRepository.findAll(page);
    }

    public void saveJobDet(JobDetModel jobDetModel) {
        jobDetRepository.save(jobDetModel);
    }
}

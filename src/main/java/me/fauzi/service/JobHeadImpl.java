package me.fauzi.service;

import me.fauzi.model.JobHeadModel;
import me.fauzi.repository.JobHeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class JobHeadImpl {
    @Autowired
    private JobHeadRepository jobHeadRepository;

    public Page<JobHeadModel> listAll(Pageable page){
        return jobHeadRepository.findAll(page);
    }

    public void saveJobHead(JobHeadModel jobHeadModel){
        jobHeadRepository.save(jobHeadModel);
    }
}

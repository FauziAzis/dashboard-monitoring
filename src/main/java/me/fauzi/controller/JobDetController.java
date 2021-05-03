package me.fauzi.controller;

import me.fauzi.model.JobDetModel;
import me.fauzi.repository.JobDetRepository;
import me.fauzi.service.JobDetImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs/detail")
public class JobDetController {
    @Autowired
    JobDetImpl jobDetImpl;

    @Autowired
    JobDetRepository jobDetRepository;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Page<JobDetModel> list(Pageable page){
        return jobDetImpl.listAll(page);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody JobDetModel jobDetModel){
        jobDetImpl.saveJobDet(jobDetModel);
    }
}

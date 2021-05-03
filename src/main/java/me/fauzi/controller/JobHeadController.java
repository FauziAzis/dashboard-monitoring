package me.fauzi.controller;


import me.fauzi.model.JobHeadModel;
import me.fauzi.service.JobHeadImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs")
public class JobHeadController {
    @Autowired
    JobHeadImpl jobHeadImpl;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Page<JobHeadModel> list(Pageable page){
        return jobHeadImpl.listAll(page);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody JobHeadModel jobHeadModel){
        jobHeadImpl.saveJobHead(jobHeadModel);
    }

}

package com.project.recruitPortalApi.controller;

import com.project.recruitPortalApi.entity.JobActivity;
import com.project.recruitPortalApi.service.JobActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class JobReadController {
    private final JobActivityService jobActivityService;

    @Autowired
    public JobReadController(JobActivityService jobActivityService) {
        this.jobActivityService = jobActivityService;
    }

    @GetMapping("/allJobs")
    public List<JobActivity> getAllJobs(){

        return jobActivityService.getAll();
    }

    @GetMapping("/{id}")
    public JobActivity getJob(@PathVariable("id")int id){

        JobActivity jobActivity =  jobActivityService.getOne(id);
        jobActivity.setPostedById(null);
        return jobActivity;
    }

    @GetMapping("/search")
    public void process(@RequestBody Map<String, Object> payload)throws Exception {


        System.out.println(payload.keySet());

    }


}

package com.project.recruitPortalApi.service;

import com.project.recruitPortalApi.entity.*;
import com.project.recruitPortalApi.repository.JobActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class JobActivityService {
    private final JobActivityRepository jobActivityRepository;

    @Autowired
    public JobActivityService(JobActivityRepository jobActivityRepository) {
        this.jobActivityRepository = jobActivityRepository;
    }

    public JobActivity addNew(JobActivity jobActivity) {
        return jobActivityRepository.save(jobActivity);
    }


    public JobActivity getOne(Integer id) {
        return jobActivityRepository.findById(id).orElseThrow(() -> new RuntimeException("Job not found."));
    }

    public void removeJob(int id) {
        jobActivityRepository.deleteById(id);
    }

    public List<JobActivity> getAll() {
        return jobActivityRepository.findAll();
    }

    public List<JobActivity> getAllByCity(String location){
        return jobActivityRepository.findJobsByCity(location);
    }


}

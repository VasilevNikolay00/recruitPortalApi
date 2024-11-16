package com.project.recruitPortalApi.service;


import com.project.recruitPortalApi.entity.JobSeekerProfile;
import com.project.recruitPortalApi.entity.User;
import com.project.recruitPortalApi.repository.JobSeekerProfileRepository;
import com.project.recruitPortalApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobSeekerProfileService {
    private final JobSeekerProfileRepository jobSeekerProfileRepository;
    private final UserRepository userRepository;

    @Autowired
    public JobSeekerProfileService(JobSeekerProfileRepository jobSeekerProfileRepository, UserRepository userRepository) {
        this.jobSeekerProfileRepository = jobSeekerProfileRepository;
        this.userRepository = userRepository;
    }

    public Optional<JobSeekerProfile> getOne(int id){
        return jobSeekerProfileRepository.findById(id);
    }

    public JobSeekerProfile addNew(JobSeekerProfile jobSeekerProfile) {
        return jobSeekerProfileRepository.save(jobSeekerProfile);
    }

}

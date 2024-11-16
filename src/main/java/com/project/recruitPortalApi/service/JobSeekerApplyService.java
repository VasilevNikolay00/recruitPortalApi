package com.project.recruitPortalApi.service;


import com.project.recruitPortalApi.entity.JobActivity;
import com.project.recruitPortalApi.entity.JobSeekerApply;
import com.project.recruitPortalApi.entity.JobSeekerProfile;
import com.project.recruitPortalApi.repository.JobSeekerApplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerApplyService {

    private final JobSeekerApplyRepository jobSeekerApplyRepository;

    @Autowired
    public JobSeekerApplyService(JobSeekerApplyRepository jobSeekerApplyRepository) {
        this.jobSeekerApplyRepository = jobSeekerApplyRepository;
    }

    public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountId) {
        return jobSeekerApplyRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerApply> getJobCandidates(JobActivity job) {
        return jobSeekerApplyRepository.findByJob(job);
    }

    public void addNew(JobSeekerApply jobSeekerApply) {
        jobSeekerApplyRepository.save(jobSeekerApply);
    }

    public void removeByJob(JobActivity jobActivity) {
        List<JobSeekerApply> jobSeekerApplyList = jobSeekerApplyRepository.findByJob(jobActivity);
        jobSeekerApplyRepository.deleteAll(jobSeekerApplyList);
    }

    public void removeByUser(JobSeekerProfile jobSeekerProfile) {
        List<JobSeekerApply> jobSeekerApplyList = jobSeekerApplyRepository.findByUserId(jobSeekerProfile);
        jobSeekerApplyRepository.deleteAll(jobSeekerApplyList);
    }
}
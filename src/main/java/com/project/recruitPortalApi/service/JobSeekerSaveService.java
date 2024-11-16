package com.project.recruitPortalApi.service;


import com.project.recruitPortalApi.entity.JobActivity;
import com.project.recruitPortalApi.entity.JobSeekerProfile;
import com.project.recruitPortalApi.entity.JobSeekerSave;
import com.project.recruitPortalApi.repository.JobSeekerSaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class JobSeekerSaveService {

    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    @Autowired
    public JobSeekerSaveService(JobSeekerSaveRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getJobCandidates(JobActivity jobActivityId) {
        return jobSeekerSaveRepository.findByJob(jobActivityId);
    }

    public void addNew(JobSeekerSave jobSeekerSave) {
        jobSeekerSaveRepository.save(jobSeekerSave);
    }

    public void removeByJob(JobActivity jobActivity) {
        List<JobSeekerSave> jobSeekerApplyList = jobSeekerSaveRepository.findByJob(jobActivity);
        jobSeekerSaveRepository.deleteAll(jobSeekerApplyList);
    }

    public void removeByUser(JobSeekerProfile jobSeekerProfile) {
        List<JobSeekerSave> jobSeekerApplyList = jobSeekerSaveRepository.findByUserId(jobSeekerProfile);
        jobSeekerSaveRepository.deleteAll(jobSeekerApplyList);
    }

}
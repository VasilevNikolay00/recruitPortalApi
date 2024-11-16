package com.project.recruitPortalApi.repository;

import com.project.recruitPortalApi.entity.JobActivity;
import com.project.recruitPortalApi.entity.JobSeekerProfile;
import com.project.recruitPortalApi.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobActivity jobActivityId);

}
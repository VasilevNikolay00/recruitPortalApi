package com.project.recruitPortalApi.repository;


import com.project.recruitPortalApi.entity.JobActivity;
import com.project.recruitPortalApi.entity.JobSeekerApply;
import com.project.recruitPortalApi.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply,Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobActivity job);

}

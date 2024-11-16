package com.project.recruitPortalApi.repository;

import com.project.recruitPortalApi.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile,Integer> {
}

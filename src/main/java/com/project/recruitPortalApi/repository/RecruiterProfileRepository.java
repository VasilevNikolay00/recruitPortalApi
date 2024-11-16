package com.project.recruitPortalApi.repository;


import com.project.recruitPortalApi.entity.RecruiterProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile,Integer> {
}

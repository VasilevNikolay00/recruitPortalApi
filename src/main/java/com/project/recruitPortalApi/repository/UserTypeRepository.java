package com.project.recruitPortalApi.repository;


import com.project.recruitPortalApi.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType,Integer> {
}

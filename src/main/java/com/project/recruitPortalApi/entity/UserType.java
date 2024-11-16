package com.project.recruitPortalApi.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users_type")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userTypeId;

    private String userTypeName;


    public UserType(int id, String userTypeName, List<User> users) {
        this.userTypeId = id;
        this.userTypeName = userTypeName;
    }

    public UserType() {
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "id=" + userTypeId +
                ", userTypeName='" + userTypeName + '\'' +
                '}';
    }
}


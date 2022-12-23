package com.boker.springbootvalidation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity
@Table(name="USERS_TBL")
public class User {
    @Id
    @GeneratedValue
    private Long userId;
    private String userName;
    private String userPhoneNo;
    private String userEmail;
    private String nationality;
    private int age;
    private  String gender;
}

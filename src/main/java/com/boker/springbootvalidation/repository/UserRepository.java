package com.boker.springbootvalidation.repository;

import com.boker.springbootvalidation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {


    Optional<User> findByUserId(Long aLong);

}

package com.yangche.userservice.repository;

import com.yangche.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {

    @Query("select u from User u where u.userId = ?1")
    User findByUserId(String userId);
}

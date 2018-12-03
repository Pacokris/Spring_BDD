package com.fmartinez.springCh.springChallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fmartinez.springCh.springChallenge.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}

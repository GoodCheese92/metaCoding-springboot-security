package com.example.security1.repository;

import com.example.security1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 들고 있음.
// @JpaRepository라는 오너테이션이 없어도 IoC된다. 이유는 JpaRepository를 상속했기 때문에...
public interface UserRepository extends JpaRepository<User, Integer> {
    // findBy 규칙 => Username 문법
    // select * from user where username = 1?
    public User findByUsername(String username); // Jpa Query method


} // end of Interface

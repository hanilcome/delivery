package com.example.delivery.domain.user.repository;

import com.example.delivery.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository
        extends JpaRepository<User, Long> {
    // 회원 가입 시 중복 아이디 확인
    boolean existsByUsername(String username);
    // 로그인 시 해당 회원 조회
    Optional<User> findByUsername(String username);
}
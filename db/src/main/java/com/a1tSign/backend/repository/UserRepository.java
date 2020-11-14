package com.a1tSign.backend.repository;

import com.a1tSign.backend.domain.UserModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModelEntity, Long> {
}

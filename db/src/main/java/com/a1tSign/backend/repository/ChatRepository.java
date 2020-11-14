package com.a1tSign.backend.repository;

import com.a1tSign.backend.domain.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<MessageModel, Long> {
}

package io.nelve.backend.persistence;

import io.nelve.backend.persistence.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}

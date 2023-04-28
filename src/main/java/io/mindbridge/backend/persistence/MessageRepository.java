package io.mindbridge.backend.persistence;

import io.mindbridge.backend.persistence.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}

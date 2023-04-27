package io.mindbridge.backend.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageRepository, Long> {
}

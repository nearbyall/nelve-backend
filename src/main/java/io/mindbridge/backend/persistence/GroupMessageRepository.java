package io.mindbridge.backend.persistence;

import io.mindbridge.backend.persistence.entity.GroupMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMessageRepository extends JpaRepository<GroupMessage, Long> {
}

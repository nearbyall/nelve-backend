package io.mindbridge.backend.persistence;

import io.mindbridge.backend.persistence.entity.UserEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEventRepository extends JpaRepository<UserEvent, Long> {
}

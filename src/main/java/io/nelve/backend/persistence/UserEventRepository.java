package io.nelve.backend.persistence;

import io.nelve.backend.persistence.entity.UserEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEventRepository extends JpaRepository<UserEvent, Long> {
}

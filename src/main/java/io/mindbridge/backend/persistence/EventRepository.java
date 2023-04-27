package io.mindbridge.backend.persistence;

import io.mindbridge.backend.persistence.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}

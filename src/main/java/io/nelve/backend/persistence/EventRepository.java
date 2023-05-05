package io.nelve.backend.persistence;

import io.nelve.backend.persistence.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}

package io.mindbridge.backend.persistence;

import io.mindbridge.backend.persistence.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}

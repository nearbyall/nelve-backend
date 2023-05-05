package io.nelve.backend.persistence;

import io.nelve.backend.persistence.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}

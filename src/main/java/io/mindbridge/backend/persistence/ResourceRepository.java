package io.mindbridge.backend.persistence;

import io.mindbridge.backend.persistence.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}

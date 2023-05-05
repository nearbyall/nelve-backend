package io.nelve.backend.persistence;

import io.nelve.backend.persistence.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}

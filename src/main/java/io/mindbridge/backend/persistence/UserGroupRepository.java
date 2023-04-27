package io.mindbridge.backend.persistence;

import io.mindbridge.backend.persistence.entity.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {
}

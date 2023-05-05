package io.nelve.backend.persistence;

import io.nelve.backend.persistence.entity.GroupMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMessageRepository extends JpaRepository<GroupMessage, Long> {
}

package io.nelve.backend.persistence;

import io.nelve.backend.persistence.entity.UserSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSkillRepository extends JpaRepository<UserSkill, Long> {
}

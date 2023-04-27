package io.mindbridge.backend.persistence;

import io.mindbridge.backend.persistence.entity.UserSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSkillRepository extends JpaRepository<UserSkill, Long> {
}

package io.mindbridge.backend.persistence;

import io.mindbridge.backend.persistence.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}

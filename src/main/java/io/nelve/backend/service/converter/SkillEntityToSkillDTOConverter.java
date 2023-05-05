package io.nelve.backend.service.converter;

import io.nelve.backend.persistence.entity.Skill;
import io.nelve.backend.service.dto.SkillDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 *
 *
 *
 */
@Component
public class SkillEntityToSkillDTOConverter implements Function<Skill, SkillDTO> {
    @Override
    public SkillDTO apply(Skill source) {
        return new SkillDTO().setId(source.getId()).setName(source.getName());
    }

}

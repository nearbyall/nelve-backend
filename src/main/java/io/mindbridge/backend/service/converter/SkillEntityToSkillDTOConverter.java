package io.mindbridge.backend.service.converter;

import io.mindbridge.backend.persistence.entity.Skill;
import io.mindbridge.backend.service.dto.SkillDTO;
import org.springframework.core.convert.converter.Converter;

public class SkillEntityToSkillDTOConverter implements Converter<Skill, SkillDTO> {
    @Override
    public SkillDTO convert(Skill source) {
        return null;
    }
}

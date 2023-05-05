package io.nelve.backend.service.converter;

import io.nelve.backend.persistence.entity.Skill;
import io.nelve.backend.service.dto.SkillDTO;

import java.util.function.Function;

public class SkillDTOToSkillEntityConverter implements Function<SkillDTO, Skill> {

    @Override
    public Skill apply(SkillDTO skillDTO) {
        return null;
    }

}

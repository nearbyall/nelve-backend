package io.nelve.backend.service.impl;

import io.nelve.backend.persistence.SkillRepository;
import io.nelve.backend.persistence.entity.Skill;
import io.nelve.backend.service.SkillService;
import io.nelve.backend.service.aspect.Loggable;
import io.nelve.backend.service.converter.SkillEntityToSkillDTOConverter;
import io.nelve.backend.service.dto.SkillDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    SkillRepository skillRepository;
    @Autowired
    SkillEntityToSkillDTOConverter skillEntityToSkillDTOConverter;

    @Override
    @Loggable
    public Page<SkillDTO> getAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Skill> entities = skillRepository.findAll(pageable);
        return entities.map(skillEntityToSkillDTOConverter);
    }

    @Override
    public Optional<SkillDTO> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<SkillDTO> delete(Long id) {
        return Optional.empty();
    }

    @Override
    @Loggable
    public Optional<SkillDTO> create(SkillDTO skillDTO) {
        Skill skill = skillRepository.save(new Skill().setName(skillDTO.getName()));
        return Optional.of(skillEntityToSkillDTOConverter.apply(skill));
    }

}

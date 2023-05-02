package io.mindbridge.backend.service.impl;

import io.mindbridge.backend.service.SkillService;
import io.mindbridge.backend.service.dto.SkillDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SkillServiceImpl implements SkillService {

    @Override
    public Page<SkillDTO> getAll(int page, int size) {
        return null;
    }

    @Override
    public Optional<SkillDTO> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<SkillDTO> delete(Long id) {
        return Optional.empty();
    }

}

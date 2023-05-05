package io.nelve.backend.service;

import io.nelve.backend.service.dto.SkillDTO;

import java.util.Optional;

public interface SkillService extends Service<SkillDTO, Long>{

    /**
     *
     *
     * @param name
     * @return
     */
    Optional<SkillDTO> create(SkillDTO skillDTO);

}

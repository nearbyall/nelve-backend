package io.nelve.backend.controller;

import io.nelve.backend.service.SkillService;
import io.nelve.backend.service.dto.SkillDTO;
import io.nelve.backend.controller.constant.ControllerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/V1/skills")
public class SkillController {

    @Autowired
    SkillService skillService;

    @GetMapping
    public ResponseEntity<Page<SkillDTO>> getAll(@RequestParam(required = false, defaultValue = ControllerConstants.DEFAULT_PAGE_STR) int page,
                                                 @RequestParam(required = false, defaultValue = ControllerConstants.DEFAULT_PAGE_SIZE_STR) int size) {

        Page<SkillDTO> result = skillService.getAll(page, size);

        return ResponseEntity.ok(result);

    }

    @PostMapping
    public ResponseEntity<SkillDTO> addNewSkill(@RequestBody SkillDTO skillDTO) {

        Optional<SkillDTO> result = skillService.create(skillDTO);

        return ResponseEntity.ok(result.get());

    }

}

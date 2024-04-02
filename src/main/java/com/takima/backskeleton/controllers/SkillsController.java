package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DAO.SkillsDao;
import com.takima.backskeleton.models.PersonalInfo;
import com.takima.backskeleton.models.Skills;
import com.takima.backskeleton.services.PersonalInfoService;
import com.takima.backskeleton.services.SkillsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("Skills")
@RestController
@RequiredArgsConstructor
public class SkillsController {
    private final SkillsService SkillsService;

    @GetMapping("")
    public List<Skills> getSkills(){
        return SkillsService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Skills> getSkillsById(@PathVariable Long id) {
        return SkillsService.getSkillsById(id);
    }

    @PostMapping("")
    public void addSkills(@RequestBody Skills Skills) {
        SkillsService.addInfo(Skills);
    }

}

package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Skills;
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
    private final SkillsService skillsService;

    @GetMapping("")
    public List<Skills> getSkills(){
        return skillsService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Skills> getSkillsById(@PathVariable Long id) {
        return skillsService.getSkillsById(id);
    }

    @PostMapping("")
    public void addSkills(@RequestBody Skills Skills) {
        skillsService.addInfo(Skills);
    }

    @DeleteMapping("")
    public void deleteAll(){skillsService.deleteAll();}
}

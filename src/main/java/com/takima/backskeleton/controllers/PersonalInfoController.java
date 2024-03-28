package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.PersonalInfo;
import com.takima.backskeleton.services.PersonalInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("PersonalInfo")
@RestController
@RequiredArgsConstructor
public class PersonalInfoController {
    private final PersonalInfoService personalInfoService;

    @GetMapping("")
    public List<PersonalInfo> getPersonalInfo(){
        return personalInfoService.getAll();
    }

    @GetMapping("/{id}")
    public PersonalInfo getPersonalInfoById(@PathVariable Long id) {
        return personalInfoService.getPersonalInfoById(id);
    }

    @PostMapping("")
    public void addPersonalInfo(@RequestBody PersonalInfo personalInfo) {
        personalInfoService.addInfo(personalInfo);
    }

    @DeleteMapping("/{id}")
    public void deletePersonalInfoById(@PathVariable Long id) {
        personalInfoService.deletePersonalInfoById(id);
    }

    @PostMapping("/{id}")
    public void updatePersonalInfo(@RequestBody PersonalInfo personalInfo, @PathVariable Long id) {
        personalInfoService.addInfo(personalInfo);
    }
}

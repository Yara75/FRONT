package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.PersonalInfo;
import com.takima.backskeleton.services.PersonalInfoService;
import com.takima.backskeleton.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("PersonalInfo")
@RestController
@RequiredArgsConstructor
public class PersonalInfoController {
    private final PersonalInfoService personalInfoService;

    @GetMapping("/")
    public List<PersonalInfo> listPersonalInfo(){
        return personalInfoService.getAll();
    }
}

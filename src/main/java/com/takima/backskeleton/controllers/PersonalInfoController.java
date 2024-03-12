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
    public List<PersonalInfo> listPersonalInfo(){
        return personalInfoService.getAll();
    }
    @GetMapping("add")
    public String addPersonalInfo(@RequestParam(required = true, name="item") String item, @RequestParam(required = true, name="info") String info){
        personalInfoService.addInfo(item,info);
        return item+":"+info+" added\n";
    }
}

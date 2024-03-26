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

    @GetMapping("addall")
    public String addAllPersonalInfo(@RequestParam(required = false, name="nom") String surname, @RequestParam(required = false, name="prenom") String name, @RequestParam(required = false, name = "age") Integer age, @RequestParam(required = false, name="adresse") String address, @RequestParam(required = false, name="courriel") String mail, @RequestParam(required = false, name="poste") String job) {
        if (!(surname ==null)) {personalInfoService.addInfo("surname",surname);}
        if (!(name ==null)) {personalInfoService.addInfo("name",name);}
        if (!(age ==null)) {personalInfoService.addInfo("age",age.toString());}
        if (!(address ==null)) {personalInfoService.addInfo("address",address);}
        if (!(mail==null)) {personalInfoService.addInfo("mail",mail);}
        if (!(job==null)) {personalInfoService.addInfo("job",job);}
        return "all info added";
    }
}

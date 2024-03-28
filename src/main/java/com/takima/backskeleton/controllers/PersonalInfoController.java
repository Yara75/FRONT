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
    @PostMapping("add")
    public String addPersonalInfo(@RequestParam(required = true, name="item") String item, @RequestParam(required = true, name="info") String info){
        personalInfoService.addInfo(item,info);
        return item+":"+info+" added\n";
    }

    @PostMapping("addall")
    public String addAllPersonalInfo(@RequestParam(required = false, name="nom") String surname, @RequestParam(required = false, name="prenom") String name, @RequestParam(required = false, name = "age") Integer age, @RequestParam(required = false, name="adresse") String address, @RequestParam(required = false, name="courriel") String mail, @RequestParam(required = false, name="poste") String job) {
        if (!(surname==null)) {personalInfoService.addInfo("surname",surname);System.out.println("add surname");}
        if (!(name ==null)) {personalInfoService.addInfo("name",name);System.out.println("add name");}
        if (!(age ==null)) {personalInfoService.addInfo("age",age.toString());System.out.println("add age");}
        if (!(address ==null)) {personalInfoService.addInfo("address",address);System.out.println("add address");}
        if (!(mail==null)) {personalInfoService.addInfo("mail",mail);System.out.println("add mail");}
        if (!(job==null)) {personalInfoService.addInfo("job",job);System.out.println("add job");}
        return "all info added";
    }
}

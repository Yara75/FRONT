package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Diploma;
import com.takima.backskeleton.services.DiplomaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@CrossOrigin
@RequestMapping("Diploma")
@RestController
@RequiredArgsConstructor
public class DiplomaController {
    private final DiplomaService diplomaService;
    @GetMapping("")
    public List<Diploma> listDiploma(){return diplomaService.getAll();}

    @PostMapping("add")
    public String addDiploma(@RequestParam(required = true, name = "obtentionDate")Date obtentionDate, @RequestParam(required = true,name = "name") String name, @RequestParam(required = true,name = "school") String school){
        diplomaService.addDiploma(obtentionDate, name, school);
        return name+", "+school+" ("+obtentionDate+")";
    }
}

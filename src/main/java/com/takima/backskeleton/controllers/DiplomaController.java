package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Diploma;
import com.takima.backskeleton.services.DiplomaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("Diploma")
@RestController
@RequiredArgsConstructor
public class DiplomaController {
    private final DiplomaService diplomaService;
    @GetMapping("")
    public List<Diploma> listDiploma(){return diplomaService.findAll();}

    @PostMapping("")
    public String addDiploma(@RequestBody Diploma diplomaTmp){
        diplomaService.addDiploma(diplomaTmp);
        return diplomaTmp.getName()+", "+diplomaTmp.getSchool()+" ("+diplomaTmp.getObtentionDate()+")";
    }

    @PostMapping("/{id}")
    public void updateDiplomaById(@PathVariable Long id, @RequestBody Diploma diplomaTmp) {
        diplomaService.updateById(diplomaTmp, id);
    }

    @GetMapping("/{id}")
    public Optional<Diploma> findDiplomaById(@PathVariable Long id) {
        return diplomaService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDiplomaById(@PathVariable Long id) {
        diplomaService.deleteById(id);
    }
}

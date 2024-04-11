package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.ExPro;
import com.takima.backskeleton.models.PersonalInfo;
import com.takima.backskeleton.services.ExProService;
import com.takima.backskeleton.services.PersonalInfoService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("ExPro")
@RestController
@RequiredArgsConstructor
public class ExProController {
    private final ExProService exProService;

    @GetMapping("")
    public List<ExPro> getExPro(){
        return exProService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<ExPro> getExProById(@PathVariable Long id) {
        return exProService.getExProById(id);
    }

    @PostMapping("")
    public void addPersonalInfo(@RequestBody ExPro ExPro) {
        exProService.addInfo(ExPro);
    }

    @DeleteMapping("")
    public void deleteAll(){exProService.deleteAll();}

    @DeleteMapping("/{id}")
    public void deleteExProById(@PathVariable long id){exProService.deleteById(id);}
}

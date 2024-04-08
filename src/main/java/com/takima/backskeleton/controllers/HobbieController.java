package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Hobbie;
import com.takima.backskeleton.services.HobbieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("Hobbie")
public class HobbieController {
    private final HobbieService hobbieService;

    @GetMapping("")
    public List<Hobbie> findAll() {
        return hobbieService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Hobbie> findById(@PathVariable Long id) {
        return hobbieService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        hobbieService.deleteById(id);
    }

    @DeleteMapping("")
    public void deleteAll(){hobbieService.deleteAll();}

    @PostMapping("")
    public void addHobbie(@RequestBody Hobbie hobbieTmp) {
        hobbieService.addHobbie(hobbieTmp);
    }

    @PostMapping("/{id}")
    public void updateHobbie(@RequestBody Hobbie hobbieTmp, @PathVariable Long id) {
        hobbieService.updateHobbie(hobbieTmp, id);
    }
}

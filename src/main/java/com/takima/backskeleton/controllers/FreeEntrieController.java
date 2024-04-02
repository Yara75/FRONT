package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.FreeEntrie;
import com.takima.backskeleton.services.FreeEntrieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("FreeEntrie")
@RestController
@RequiredArgsConstructor
public class FreeEntrieController {
    private final FreeEntrieService freeEntrieService;

    @GetMapping("")
    public List<FreeEntrie> listEntries(){
        return freeEntrieService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FreeEntrie> getFreeEntrieById(@PathVariable Long id) {
        return freeEntrieService.findAllById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {freeEntrieService.deleteById(id);}

    @PostMapping("add")
    public String addFreeEntrie(@RequestBody FreeEntrie freeEntrieTmp) {
        freeEntrieService.addEntrie(freeEntrieTmp);
        return freeEntrieTmp.getSection()+":"+freeEntrieTmp.getInfo()+" added";
    }

    @PostMapping("/{id}")
    public void updateEntrieById(@RequestBody FreeEntrie freeEntrieTmp, @PathVariable Long id) {
        freeEntrieService.updateInfo(freeEntrieTmp, id);
    }
}

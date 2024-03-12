package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.FreeEntrie;
import com.takima.backskeleton.services.FreeEntrieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("FreeEntrie")
@RestController
@RequiredArgsConstructor
public class FreeEntrieController {
    private final FreeEntrieService freeEntrieService;

    @GetMapping("")
    public List<FreeEntrie> listFreeEntrie(){
        return freeEntrieService.getAll();
    }

    @GetMapping("add")
    public String addFreeEntrie(@RequestParam(required = true,name = "section") String section, @RequestParam(required = true,name = "info") String info) {
        freeEntrieService.addInfo(section,info);
        return section+":"+info+" added";
    }
}

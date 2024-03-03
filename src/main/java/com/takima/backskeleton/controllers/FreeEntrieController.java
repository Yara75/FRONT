package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.FreeEntrie;
import com.takima.backskeleton.services.FreeEntrieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

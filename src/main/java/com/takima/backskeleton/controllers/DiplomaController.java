package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Diploma;
import com.takima.backskeleton.services.DiplomaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("Diploma")
@RestController
@RequiredArgsConstructor
public class DiplomaController {
    private final DiplomaService diplomaService;
    @GetMapping("")
    public List<Diploma> listDiploma(){return diplomaService.getAll();}
}

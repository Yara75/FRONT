package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Certif;
import com.takima.backskeleton.services.CertifService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("Certif")
public class CertifController {
    private final CertifService certifService;

    @GetMapping("")
    public List<Certif> findAll() {return certifService.findAll();}

    @GetMapping("/{id}")
    public Optional<Certif> findById(@PathVariable Long id) {
        return certifService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        certifService.deleteById(id);
    }

    @PostMapping("")
    public void addCertif(@RequestBody Certif certifTmp) {
        certifService.addCertif(certifTmp);
    }

    @PostMapping("/{id}")
    public void updateCertif(@RequestBody Certif certifTmp, @PathVariable Long id) {
        certifService.updateCertif(certifTmp, id);
    }
}

package com.takima.backskeleton.controllers;
import com.takima.backskeleton.models.Infos;
import com.takima.backskeleton.services.InfosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/infos")
@RequiredArgsConstructor
public class InfosController {
    private final InfosService infosService;

    @GetMapping
    public List<Infos> getAllInfos() {
        return infosService.findAllInfos();
    }

    @PostMapping("/enregistrer")
    public Infos enregistrerInfos(@RequestBody Infos infos) {
        System.out.println("Requête d'enregistrement reçue avec nom : " + infos.getNom() + ", prenom : " + infos.getPrenom());
        return infosService.saveInfo(infos);
    }

}

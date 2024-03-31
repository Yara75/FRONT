package com.takima.backskeleton.services;

import com.takima.backskeleton.models.Infos;
import com.takima.backskeleton.DAO.InfosDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InfosService {
    private final InfosDao infosDao;

    public List<Infos> findAllInfos() {
        List<Infos> allInfos = infosDao.findAll();

        // Vérifier si la liste est vide
        if (allInfos.isEmpty()) {
            System.out.println("Aucune donnée trouvée dans la table Infos.");
        } else {
            // Afficher les données dans la console
            for (Infos info : allInfos) {
                System.out.println("ID: " + info.getId() + ", Nom: " + info.getNom() + ", Prénom: " + info.getPrenom());
            }
        }
        return allInfos;
    }

    public Infos saveInfo(Infos infos) {
        return infosDao.save(infos);
    }
}





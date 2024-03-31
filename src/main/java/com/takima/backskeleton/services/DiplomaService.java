package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.DiplomaDao;
import com.takima.backskeleton.models.Diploma;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DiplomaService {
    private final DiplomaDao diplomaDao;

    @Transactional
    public List<Diploma> findAll(){
        Iterable<Diploma> it = diplomaDao.findAll();
        List<Diploma> diplomas = new ArrayList<>();
        it.forEach(diplomas::add);
        return diplomas;
    }

    @Transactional
    public Optional<Diploma> findById(Long id) {
        return diplomaDao.findById(id);
    }

    public void deleteById(Long id) {
        diplomaDao.deleteById(id);
    }

    @Transactional
    public void addDiploma(Diploma diplomaTmp) {
        diplomaDao.save(diplomaTmp);
    }

    public void updateById(Diploma diplomaTmp, Long id){
        if (diplomaDao.findById(id).isEmpty()) {
            diplomaDao.save(diplomaTmp);
        } else {
            diplomaDao.updateContactById(id, diplomaTmp.getObtentionDate(), diplomaTmp.getName(), diplomaTmp.getSchool());
        }
    }
}

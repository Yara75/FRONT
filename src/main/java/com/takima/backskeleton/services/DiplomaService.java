package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.DiplomaDao;
import com.takima.backskeleton.models.Diploma;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DiplomaService {
    private final DiplomaDao diplomaDao;

    @Transactional
    public List<Diploma> getAll(){
        Iterable<Diploma> it = diplomaDao.getAll();
        List<Diploma> diplomas = new ArrayList<>();
        it.forEach(diplomas::add);
        return diplomas;
    }

    @Transactional
    public void addDiploma(Date date, String name, String school) {
        try {
            diplomaDao.addDiploma(date, name, school);
        } catch (org.springframework.orm.jpa.JpaSystemException e) {
            System.out.println("Exception handled");
        }
    }
}

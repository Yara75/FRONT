package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.DiplomaDao;
import com.takima.backskeleton.models.Diploma;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DiplomaService {
    private final DiplomaDao diplomaDao;

    public List<Diploma> getAll(){
        Iterable<Diploma> it = diplomaDao.getAll();
        List<Diploma> diplomas = new ArrayList<>();
        it.forEach(diplomas::add);
        return diplomas;
    }

    public void addDiploma(Date date, String name, String school) {
        diplomaDao.addDiploma(date, name, school);
    }
}

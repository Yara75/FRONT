package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ExProDao;
import com.takima.backskeleton.models.ExPro;
import com.takima.backskeleton.models.PersonalInfo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExProService {
    private final ExProDao exProDao;

    @Transactional
    public List<ExPro> getAll() {
        Iterable<ExPro> allPI = exProDao.findAll();
        List<ExPro> infos = new ArrayList<>();
        allPI.forEach(infos::add);
        return infos;
    }

    @Transactional
    public Optional<ExPro> getExProById(Long id) {
        return exProDao.findById(id);
    }

    @Transactional
    public void deleteAll(){exProDao.deleteAll();}

    @Transactional
    public void addInfo(ExPro exPro) {
        exProDao.save(exPro);
    }
}

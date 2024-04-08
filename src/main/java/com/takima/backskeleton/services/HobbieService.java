package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.HobbieDao;
import com.takima.backskeleton.models.Hobbie;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HobbieService {
    private final HobbieDao hobbieDao;

    @Transactional
    public List<Hobbie> findAll() {
        Iterable<Hobbie> allHobbie = hobbieDao.findAll();
        List<Hobbie> hobbies = new ArrayList<>();
        allHobbie.forEach(hobbies::add);
        return hobbies;
    }

    @Transactional
    public Optional<Hobbie> findById(Long id) {
        return hobbieDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        hobbieDao.deleteById(id);
    }

    @Transactional
    public void deleteAll(){hobbieDao.deleteAll();}

    @Transactional
    public void addHobbie(Hobbie hobbieTmp) {
        hobbieDao.save(hobbieTmp);
    }

    @Transactional
    public void updateHobbie(Hobbie hobbieTmp, Long id) {
        hobbieDao.updateById(hobbieTmp.getDescription(), id);
    }
}

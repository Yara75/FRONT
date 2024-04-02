package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.SkillsDao;
import com.takima.backskeleton.models.PersonalInfo;
import com.takima.backskeleton.models.Skills;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SkillsService {
    private final SkillsDao SkillsDao;

    @Transactional
    public List<Skills> getAll() {
        Iterable<Skills> allPI = SkillsDao.findAll();
        List<Skills> infos = new ArrayList<>();
        allPI.forEach(infos::add);
        return infos;
    }

    @Transactional
    public void addInfo(Skills Skills){
        SkillsDao.deleteAll();
        SkillsDao.save(Skills);
    }

    @Transactional
    public Optional<Skills> getSkillsById(Long id) {
        return SkillsDao.findById(id);
    }

}

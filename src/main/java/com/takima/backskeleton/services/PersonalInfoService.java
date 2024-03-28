package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.PersonalInfoDao;
import com.takima.backskeleton.models.PersonalInfo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonalInfoService {
    private final PersonalInfoDao personalInfoDao;

    @Transactional
    public List<PersonalInfo> getAll() {
        Iterable<PersonalInfo> allPI = personalInfoDao.findAll();
        List<PersonalInfo> infos = new ArrayList<>();
        allPI.forEach(infos::add);
        return infos;
    }

    @Transactional
    public void addInfo(PersonalInfo personalInfoTmp){
        if (personalInfoDao.getItems().contains(personalInfoTmp.getItem())) {
            personalInfoDao.updateInfo(personalInfoTmp.getItem(),personalInfoTmp.getInfo());
        } else {
            personalInfoDao.save(personalInfoTmp);
        }
    }

    @Transactional
    public Optional<PersonalInfo> getPersonalInfoById(Long id) {
        return personalInfoDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        personalInfoDao.deleteById(id);
    }

    @Transactional
    public void updatePersonalInfo(PersonalInfo personalInfoTmp, Long id) {
        if (personalInfoDao.getItems().contains(personalInfoTmp.getItem())) {
            personalInfoDao.updateInfo(personalInfoTmp.getItem(),personalInfoTmp.getInfo());
        } else {
            personalInfoDao.save(personalInfoTmp);
        }
    }

    @Transactional
    public void deletePersonalInfoById(Long id) {
        personalInfoDao.deleteById(id);
    }
}

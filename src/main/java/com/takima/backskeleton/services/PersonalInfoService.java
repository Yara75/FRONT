package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.PersonalInfoDao;
import com.takima.backskeleton.models.PersonalInfo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonalInfoService {
    private final PersonalInfoDao personalInfoDao;

    @Transactional
    public List<PersonalInfo> getAll() {
        Iterable<PersonalInfo> allPI = personalInfoDao.getAll();
        List<PersonalInfo> infos = new ArrayList<>();
        allPI.forEach(infos::add);
        return infos;
    }

    @Transactional
    public void addInfo(String item, String info) {
        try {
            if (getItems().contains(item)) {
                personalInfoDao.updateInfo(item,info);
            }
            else {personalInfoDao.addInfo(item,info);}
        } catch (org.springframework.orm.jpa.JpaSystemException e) {
            System.out.println("Exception handled");
        }
    }

    @Transactional
    public List<String> getItems() {
        Iterable<String> allItem = personalInfoDao.getItems();
        List<String> list = new ArrayList<>();
        allItem.forEach(list::add);
        return list;
    }

    @Transactional
    public void deleteById(Long id) {
        personalInfoDao.deleteById(id);
    }
}

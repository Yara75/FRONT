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

    public List<PersonalInfo> getAll() {
        Iterable<PersonalInfo> allPI = personalInfoDao.getAll();
        List<PersonalInfo> infos = new ArrayList<>();
        allPI.forEach(infos::add);
        return infos;
    }

    public void addInfo(String item, String info) {
        personalInfoDao.addInfo(item,info);
    }
}

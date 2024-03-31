package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.FreeEntrieDao;
import com.takima.backskeleton.models.FreeEntrie;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FreeEntrieService {
    private final FreeEntrieDao freeEntrieDao;

    @Transactional
    public List<FreeEntrie> findAll() {
        Iterable<FreeEntrie> allFE = freeEntrieDao.findAll();
        List<FreeEntrie> entries = new ArrayList<>();
        allFE.forEach(entries::add);
        return entries;
    }

    @Transactional
    public Optional<FreeEntrie> findAllById(Long id) {
        return freeEntrieDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        freeEntrieDao.deleteById(id);
    }

    @Transactional
    public void addInfo(FreeEntrie freeEntrieTmp) {
        freeEntrieDao.save(freeEntrieTmp);
    }

    public void updateInfo(FreeEntrie freeEntrieTmp, Long id) {
        if (freeEntrieDao.findById(id).isEmpty()) {
            freeEntrieDao.save(freeEntrieTmp);
        } else {
            freeEntrieDao.updateFreeEntrieById(id, freeEntrieTmp.getSection(), freeEntrieTmp.getInfo());
        }
    }
}

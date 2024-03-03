package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.FreeEntrieDao;
import com.takima.backskeleton.models.FreeEntrie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FreeEntrieService {
    private final FreeEntrieDao freeEntrieDao;

    public List<FreeEntrie> getAll() {
        Iterable<FreeEntrie> allFE = freeEntrieDao.getAll();
        List<FreeEntrie> entries = new ArrayList<>();
        allFE.forEach(entries::add);
        return entries;
    }
}
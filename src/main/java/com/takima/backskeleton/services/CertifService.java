package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.CertifDao;
import com.takima.backskeleton.models.Certif;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CertifService {
    private final CertifDao certifDao;

    @Transactional
    public List<Certif> findAll() {
        Iterable<Certif> allCert = certifDao.findAll();
        ArrayList<Certif> certifs = new ArrayList<>();
        allCert.forEach(certifs::add);
        return certifs;
    }

    @Transactional
    public Optional<Certif> findById(Long id) {
        return certifDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        certifDao.deleteById(id);
    }

    @Transactional
    public void addCertif(Certif certifTmp) {
        certifDao.save(certifTmp);
    }

    @Transactional
    public void updateCertif(Certif certifTmp, Long id) {
        certifDao.updateById(certifTmp.getName(), certifTmp.getDomain(), id);
    }
}

package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Certif;
import com.takima.backskeleton.models.Hobbie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CertifDao extends JpaRepository<Certif, Long> {
    @Query(value = "update Certif set name=?1, domain=?2 where id=?3")
    void updateById(String name, String domain, Long id);
}

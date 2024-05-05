package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Certif;
import com.takima.backskeleton.models.Hobbie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface CertifDao extends JpaRepository<Certif, Long> {
   // @Query(value = "update Certif set name=?1, domain=?2 where id=?3")
    //void updateById(String name, String domain, Long id);

    @Modifying
    @Query("UPDATE Certif SET name = :name, domain = :domain WHERE id = :id")
    void updateById(@Param("name") String name, @Param("domain") String domain, @Param("id") Long id);
}

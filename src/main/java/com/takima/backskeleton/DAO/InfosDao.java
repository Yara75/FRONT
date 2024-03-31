package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Infos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfosDao extends JpaRepository<Infos, Long> {
    @Query("SELECT i.id, i.nom, i.prenom FROM Infos i")
    List<Object[]> findAllInfos();
}

package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.ExPro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ExProDao extends JpaRepository<ExPro, Long> {
    @Query(nativeQuery = true, value = "SELECT p.nameC, p.beginD, p.endD, p.job FROM ExPro p")
    List<String> getItems();
}

package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Diploma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface DiplomaDao extends JpaRepository<Diploma, Long> {
    @Query(nativeQuery = true, value = "SELECT d.id, d.obtentiondate, d.name, d.school FROM Diploma d")
    List<Diploma> getAll();

    @Query(nativeQuery = true, value = "INSERT INTO Diploma(obtentionDate,name,school) VALUES (?1,?2,?3)")
    void addDiploma(Date date, String name, String school);
}

package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Diploma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface DiplomaDao extends JpaRepository<Diploma, Long> {
    @Query(value = "UPDATE Diploma SET obtentionDate=?2, name=?3, school=?4 where id=?1")
    void updateContactById(Long id, Date date, String name, String school);
}

package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.List;

@Repository
public interface PersonalInfoDao extends JpaRepository<PersonalInfo, Long> {

    @Query(nativeQuery = true, value = "SELECT p.item FROM PersonalInfo p")
    List<String> getItems();

    @Query(nativeQuery = true, value = "UPDATE PersonalInfo SET surname=?1, name=?2, birth=?3 WHERE id= ?4")
    void updateInfo(String surname, String name, Date birth, Long id);
}

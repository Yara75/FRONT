package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalInfoDao extends JpaRepository<PersonalInfo, Long> {
    @Query(nativeQuery = true, value ="SELECT p.id, p.item, p.info FROM PersonalInfo p")
    List<PersonalInfo> getAll();

    @Query(nativeQuery = true, value = "INSERT INTO PersonalInfo(item,info) VALUES (?1,?2)")
    void addInfo(String item, String info);

    @Query(nativeQuery = true, value = "SELECT p.item FROM PersonalInfo p")
    List<String> getItems();

    @Query(nativeQuery = true, value = "UPDATE PersonalInfo SET info= ?2 WHERE item= ?1")
    void updateInfo(String item, String info);
}

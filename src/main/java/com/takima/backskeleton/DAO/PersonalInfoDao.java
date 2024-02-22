package com.takima.backskeleton.DAO;

import com.takima.backskeleton.DTO.PersonalInfoDto;
import com.takima.backskeleton.models.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalInfoDao extends JpaRepository<PersonalInfo, Long> {
    @Query("SELECT p.item FROM PersonalInfo p")
    List<PersonalInfo> getAll();
}

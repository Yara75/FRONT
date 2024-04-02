package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.ExPro;
import com.takima.backskeleton.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillsDao extends JpaRepository<Skills, Long> {
    @Query(nativeQuery = true, value = "SELECT p.domains, p.details FROM Skills p")
    List<String> getItems();
}


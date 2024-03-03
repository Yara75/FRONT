package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.FreeEntrie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FreeEntrieDao extends JpaRepository<FreeEntrie, Long> {
    @Query(nativeQuery = true, value = "SELECT f.id, f.section, f.info FROM FreeEntrie f")
    List<FreeEntrie> getAll();
}

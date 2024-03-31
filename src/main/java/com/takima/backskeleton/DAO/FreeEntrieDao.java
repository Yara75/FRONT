package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.FreeEntrie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FreeEntrieDao extends JpaRepository<FreeEntrie, Long> {
    @Query(value = "UPDATE FreeEntrie SET section=?2, info=?3 where id=?1")
    void updateFreeEntrieById(Long id, String section, String info);
}

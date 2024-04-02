package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Hobbie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbieDao extends JpaRepository<Hobbie,Long> {
    @Query(value = "update Hobbie set description=?1 where id=?2")
    void updateById(String description, Long id);
}

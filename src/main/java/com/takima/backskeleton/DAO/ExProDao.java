package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.ExPro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ExProDao extends JpaRepository<ExPro, Long> {
    // @Query(nativeQuery = true, value = "SELECT p.nameC, p.beginD, p.endD, p.job FROM ExPro p")
    //List<String> getItems();

    @Modifying
    @Query("UPDATE ExPro SET nameC = :nameC, beginD = :beginD, endD = :endD, job = :job WHERE id = :id")
    void updateById(@Param("nameC") String nameC,
                    @Param("beginD") Date beginD,
                    @Param("endD") Date endD,
                    @Param("job") String job,
                    @Param("id") Long id);
}

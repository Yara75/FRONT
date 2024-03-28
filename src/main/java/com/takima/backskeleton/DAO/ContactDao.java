package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactDao extends JpaRepository<Contact,Long> {
    @Query(value = "UPDATE Contact SET type=?2, info=?3 where id=?1")
    void updateContactById(Long id, String type, String info);
}

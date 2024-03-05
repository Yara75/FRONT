package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactDao extends JpaRepository<Contact,Long> {
    @Query(nativeQuery = true, value = "SELECT c.id, c.type, c.info FROM contact c")
    List<Contact> getAll();
}

package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface MessageDao extends JpaRepository<Message, Long> {

    @Query(value = "update Message set surname=?1, name=?2, contact=?3, date=?4, messageBody=?5 where id=?6")
    public void updateById(String surname, String name, String contact, Date date, String message, Long id);
}

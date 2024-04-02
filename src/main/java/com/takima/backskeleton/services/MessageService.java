package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.MessageDao;
import com.takima.backskeleton.models.Message;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MessageService {
    private final MessageDao messageDao;

    @Transactional
    public List<Message> findAll() {
        Iterable<Message> allMessage = messageDao.findAll();
        ArrayList<Message> messages = new ArrayList<>();
        allMessage.forEach(messages::add);
        return messages;
    }

    @Transactional
    public Optional<Message> findById(Long id) {
        return messageDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        messageDao.deleteById(id);
    }

    @Transactional
    public void addMessage(Message messageTmp) {
        messageDao.save(messageTmp);
    }

    @Transactional
    public void updateMessageById(Message messageTmp, Long id) {
        messageDao.updateById(messageTmp.getSurname(), messageTmp.getName(), messageTmp.getContact(), messageTmp.getDate(), messageTmp.getMessageBody(), id);
    }
}

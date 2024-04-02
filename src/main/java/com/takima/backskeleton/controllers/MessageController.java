package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Message;
import com.takima.backskeleton.services.MessageService;
import jdk.dynalink.linker.LinkerServices;
import lombok.RequiredArgsConstructor;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("Message")
public class MessageController {
    private MessageService messageService;

    @GetMapping("")
    public List<Message> findAll() {return messageService.findAll();}

    @GetMapping("/{id}")
    public Optional<Message> findById(@PathVariable Long id) {
        return messageService.findById(id);
    }

    @PostMapping("/{id}")
    public void deleteById(@PathVariable Long id) {messageService.deleteById(id);}

    @PostMapping("")
    public void addMessage(@RequestBody Message messageTmp) {messageService.addMessage(messageTmp);}

    @PostMapping("/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Message messageTmp) {
        messageService.updateMessageById(messageTmp, id);
    }
}

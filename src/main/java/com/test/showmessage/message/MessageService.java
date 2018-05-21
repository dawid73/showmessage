package com.test.showmessage.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(final MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    public List<Message> findAll() {
        return messageRepository.findAll();
    }
}

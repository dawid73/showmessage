package com.test.showmessage.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping("/wiadomosci")
    public String wiadomosci(Model model){
        List<Message> messageList = messageService.findAll();
        model.addAttribute("wiadomosci" , messageList);
        return "wiadomosci";
    }
}

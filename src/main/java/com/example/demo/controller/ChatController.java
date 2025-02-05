package com.example.demo.controller;

import com.example.demo.model.Message;
import com.example.demo.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatController {

    @Autowired
    private ChatService chatService;

    @GetMapping("/chat")
    public String chat(Model model) {
        model.addAttribute("messages", chatService.getMessages());
        return "chat";
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String sender, @RequestParam String content) {
        Message message = new Message(sender, content);
        chatService.addMessage(message);
        return "redirect:/chat";
    }
}

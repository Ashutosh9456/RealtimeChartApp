package com.example.chatapp.controller;

import com.example.chatapp.model.Message;
import com.example.chatapp.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    // Get messages for a specific chat room
    @GetMapping("/chatroom/{chatRoomId}")
    public List<Message> getMessages(@PathVariable String chatRoomId) {
        return messageService.getMessagesByChatRoom(chatRoomId);
    }

    // Send a new message to a chat room
    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        return messageService.sendMessage(message);
    }
}
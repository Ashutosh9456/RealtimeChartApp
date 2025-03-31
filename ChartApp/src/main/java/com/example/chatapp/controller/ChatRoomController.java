package com.example.chatapp.controller;

import com.example.chatapp.model.ChatRoom;
import com.example.chatapp.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chatrooms")
public class ChatRoomController {

    @Autowired
    private ChatRoomService chatRoomService;

    // Create a new chat room
    @PostMapping
    public ChatRoom createChatRoom(@RequestBody ChatRoom chatRoom) {
        return chatRoomService.createChatRoom(chatRoom);
    }

    // Get all chat rooms
    @GetMapping
    public List<ChatRoom> getAllChatRooms() {
        return chatRoomService.getAllChatRooms();
    }
}

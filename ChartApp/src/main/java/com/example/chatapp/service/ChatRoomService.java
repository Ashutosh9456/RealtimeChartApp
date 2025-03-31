package com.example.chatapp.service;

import com.example.chatapp.model.ChatRoom;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatRoomService {

    private List<ChatRoom> chatRooms = new ArrayList<>();

    public ChatRoom createChatRoom(ChatRoom chatRoom) {
        chatRooms.add(chatRoom);
        return chatRoom;
    }

    public List<ChatRoom> getAllChatRooms() {
        return chatRooms;
    }
}

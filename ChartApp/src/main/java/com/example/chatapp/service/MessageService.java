package com.example.chatapp.service;

import com.example.chatapp.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    private List<Message> messages = new ArrayList<>();

    public List<Message> getMessagesByChatRoom(String chatRoomId) {
        List<Message> chatRoomMessages = new ArrayList<>();
        for (Message message : messages) {
            if (message.getChatRoomId().equals(chatRoomId)) {
                chatRoomMessages.add(message);
            }
        }
        return chatRoomMessages;
    }

    public Message sendMessage(Message message) {
        messages.add(message);
        return message;
    }
}

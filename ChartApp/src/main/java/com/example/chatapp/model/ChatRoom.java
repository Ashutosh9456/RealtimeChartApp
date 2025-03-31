package com.example.chatapp.model;

import java.util.List;

public class ChatRoom {
    private String id;
    private String name;
    private List<String> participants;

    // Constructors, getters, and setters
    public ChatRoom(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }
}

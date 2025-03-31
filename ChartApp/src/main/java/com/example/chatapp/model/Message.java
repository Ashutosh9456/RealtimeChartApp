package com.example.chatapp.model;

public class Message {
    private String chatRoomId;
    private String sender;
    private String content;
    private long timestamp;

    // Constructors, getters, and setters
    public Message(String chatRoomId, String sender, String content) {
        this.chatRoomId = chatRoomId;
        this.sender = sender;
        this.content = content;
        this.timestamp = System.currentTimeMillis();
    }

    public String getChatRoomId() {
        return chatRoomId;
    }

    public void setChatRoomId(String chatRoomId) {
        this.chatRoomId = chatRoomId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}

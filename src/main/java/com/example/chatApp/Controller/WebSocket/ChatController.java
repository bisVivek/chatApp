package com.example.chatApp.Controller.WebSocket;

import com.example.chatApp.Model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;

public class ChatController {

    @MessageMapping("/sendMessage") // Client will send message to /app/sendMessage
    @SendTo("/topic/messages")
    public Message sendMessage(@Payload Message message) {
        return message; // Modify as needed to save to DB before broadcasting
    }
}

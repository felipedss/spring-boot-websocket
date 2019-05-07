package com.felipedsr.springbootwschat.controller;

import com.felipedsr.springbootwschat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller("/chat")
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("chat/public")
    public ChatMessage onReceivedMessage(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }

}
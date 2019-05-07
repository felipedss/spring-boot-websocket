package com.felipedsr.springbootwschat.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {

    private MessageType messageType;
    private String content;
    private String sender;

}
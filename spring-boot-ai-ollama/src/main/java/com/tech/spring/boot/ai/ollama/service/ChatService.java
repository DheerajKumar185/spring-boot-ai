package com.tech.spring.boot.ai.ollama.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private final ChatClient chatClient;

    public ChatService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String getResponse(String prompt) {
        return chatClient.prompt()
                .user(prompt)
                .call()
                .content();
    }
}

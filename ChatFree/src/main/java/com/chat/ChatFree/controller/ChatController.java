package com.chat.ChatFree.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chat.ChatFree.Model.ChatMessage;

@Controller
public class ChatController {

	@MessageMapping("/sendMessage") // /app/sendMessage
	@SendTo("/topic/messages")
	public ChatMessage sendMessage(ChatMessage message) {
		
		return message;
	}
	
	@GetMapping("/chat")
	public String chat() {
		
		return "chat";
	}
}

package com.chat.ChatFree.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   // automaticaly generate getter setter lombok annotation
@NoArgsConstructor      // generate contructor lombok annotaion
public class ChatMessage {

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("sender")
	private String sender;
	
	@JsonProperty("content")
	private String content;
	
	
}

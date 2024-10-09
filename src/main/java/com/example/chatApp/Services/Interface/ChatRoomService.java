package com.example.chatApp.Services.Interface;

import com.example.chatApp.Model.ChatRoom;

import java.util.Optional;

public interface ChatRoomService {
    ChatRoom createChatRoom(ChatRoom chatRoom);
    Optional<ChatRoom> getChatRoomById(Long id);
}

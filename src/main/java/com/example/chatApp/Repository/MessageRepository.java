package com.example.chatApp.Repository;

import com.example.chatApp.Model.ChatRoom;
import com.example.chatApp.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByChatRoom (ChatRoom chatroom);
}

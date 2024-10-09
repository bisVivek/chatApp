package com.example.chatApp.Controller;

import com.example.chatApp.Model.ChatRoom;
import com.example.chatApp.Services.Interface.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chatrooms")
public class ChatRoomController {
    @Autowired
    private ChatRoomService chatRoomService;

    @PostMapping("/create")
    public ResponseEntity<ChatRoom> createChatRoom(@RequestBody ChatRoom chatRoom) {
        return new ResponseEntity<>(chatRoomService.createChatRoom(chatRoom), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ChatRoom> getChatRoom(@PathVariable Long id) {
        return ResponseEntity.of(chatRoomService.getChatRoomById(id));
    }
}

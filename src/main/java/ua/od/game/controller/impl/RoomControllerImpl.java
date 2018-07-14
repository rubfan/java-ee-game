package ua.od.game.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.od.game.controller.RoomController;
import ua.od.game.dto.RoomDto;
import ua.od.game.service.RoomService;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@RestController
@RequestMapping("/room")
public class RoomControllerImpl implements RoomController {

    @Autowired
    public RoomService roomService;

    @GetMapping(name = "/list")
    public List<RoomDto> getRoomList() {
        List<RoomDto> roomList = roomService.getListOfRooms();
        Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, roomList.toString());
        return roomList;
    }

    @GetMapping("/{roomId}/join")
    public ResponseEntity<?> joinRoom(@PathVariable(value = "roomId") Long roomId) {
        Logger.getLogger(this.getClass().getName()).log(Level.SEVERE,"room=" + roomId);
        roomService.joinRoom(roomId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{roomId}/exit")
    public ResponseEntity<?> exitRoom(@PathVariable(value = "roomId") Long roomId) {
        Logger.getLogger(this.getClass().getName()).log(Level.SEVERE,"room=" + roomId);
        roomService.leaveRoom(roomId);
        return ResponseEntity.ok().build();
    }
}


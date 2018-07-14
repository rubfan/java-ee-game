package ua.od.game.controller;

import org.springframework.http.ResponseEntity;
import ua.od.game.dto.RoomDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface RoomController {
    List<RoomDto> getRoomList();
    ResponseEntity<?> joinRoom(Integer roomId);
    ResponseEntity<?> exitRoom(Integer roomId);
}

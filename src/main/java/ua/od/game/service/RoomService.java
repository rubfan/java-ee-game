package ua.od.game.service;

import ua.od.game.dto.RoomDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface RoomService {
    List<RoomDto> getListOfRooms();
    RoomDto joinRoom(Long roomId);
    RoomDto leaveRoom(Long roomId);
}

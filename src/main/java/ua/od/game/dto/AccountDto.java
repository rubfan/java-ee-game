package ua.od.game.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Data
public class AccountDto {
    private Integer id;
    private UserDto user;
    private RoomDto room;
    private Date startGameTime;
}

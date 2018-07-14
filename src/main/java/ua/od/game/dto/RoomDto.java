package ua.od.game.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {
    private int id;
    private String name;
    private String description;
    private Date startGameTime;
}

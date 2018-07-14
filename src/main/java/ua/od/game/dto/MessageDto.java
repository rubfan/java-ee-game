package ua.od.game.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Data
public class MessageDto {
    private Integer id;
    private String text;
    private Integer fromAccountId;
    private Integer toAccountId;
    private Date time;
}

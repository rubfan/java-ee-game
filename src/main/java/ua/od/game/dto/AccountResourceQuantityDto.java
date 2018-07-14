package ua.od.game.dto;

import lombok.Data;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Data
public class AccountResourceQuantityDto {
    private Integer resourceId;
    private Integer resourceNumber;
    private Integer resourcePerMin;
}

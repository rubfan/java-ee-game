package ua.od.game.dto;

import lombok.Data;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Data
public class AccountResourceDto {
    private Integer accountId;
    private Integer resourceId;
    private Integer quantity;
}

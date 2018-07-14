package ua.od.game.dto;

import lombok.Data;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Data
public class AccountUpgradeDto {
    private Integer accountId;
    private Integer upgradeId;
    private Integer quantity;
}

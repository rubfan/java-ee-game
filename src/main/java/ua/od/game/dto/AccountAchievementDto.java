package ua.od.game.dto;

import lombok.Data;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Data
public class AccountAchievementDto {
    private Integer accountId;
    private Integer achievementId;
    private Float number;
}

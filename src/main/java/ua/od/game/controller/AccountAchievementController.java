package ua.od.game.controller;

import org.springframework.http.ResponseEntity;
import ua.od.game.dto.AccountAchievementDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface AccountAchievementController {
    List<AccountAchievementDto> getAccountAchievementsList(Integer accountId);
    ResponseEntity<?> clearAccountAchievementsList(Integer accountId);
    ResponseEntity<?> addAchievementToAccount(Integer accountId, Integer achievementId);
}

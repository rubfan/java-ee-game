package ua.od.game.controller;

import ua.od.game.dto.AchievementDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface AchievementController {
    List<AchievementDto> getListOfAchievements();
}

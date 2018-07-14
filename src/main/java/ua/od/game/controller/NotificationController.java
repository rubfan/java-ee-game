package ua.od.game.controller;

import ua.od.game.dto.NotificationDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface NotificationController {

    List<NotificationDto> getNotificationsList();
    String getNotification(Integer notificationId);
}

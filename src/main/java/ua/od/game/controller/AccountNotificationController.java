package ua.od.game.controller;

import org.springframework.http.ResponseEntity;
import ua.od.game.dto.AccountNotificationDto;
import ua.od.game.dto.NotificationDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface AccountNotificationController {
    List<AccountNotificationDto> getListOfAccountNotifications(Integer accountId);
    ResponseEntity<?> clearAccountNotificationList(Integer accountId);
    ResponseEntity<?> addShownNotificationToAccount(Integer accountId, Integer notificationId);
    List<NotificationDto> getListOfAccountRecentNotifications(Integer accountId);
}

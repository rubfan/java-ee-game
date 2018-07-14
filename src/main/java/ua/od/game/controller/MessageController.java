package ua.od.game.controller;

import ua.od.game.dto.MessageDto;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
import javax.servlet.http.Cookie;
import javax.xml.ws.Response;
import java.util.List;

public interface MessageController {
    List<MessageDto> getMessagesList();
    Response sendMessage(MessageDto message, Cookie cookie);
    List<MessageDto> getRoomMessages(Cookie cookie);
}

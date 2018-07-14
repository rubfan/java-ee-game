package ua.od.game.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import ua.od.game.model.User;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface LoginController {
    ModelAndView login();
    ModelAndView registration();
    ModelAndView createNewUser(User user, BindingResult bindingResult);
    ModelAndView home();
}

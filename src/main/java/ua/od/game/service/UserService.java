package ua.od.game.service;

import ua.od.game.model.User;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}

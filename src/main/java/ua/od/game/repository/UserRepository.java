package ua.od.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.od.game.model.User;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
	 User findByEmail(String email);
}

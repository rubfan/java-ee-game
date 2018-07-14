package ua.od.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.od.game.model.Room;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface RoomRepository extends JpaRepository<Room, Integer> {
}

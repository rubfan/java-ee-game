package ua.od.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.od.game.model.RoomEntity;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface RoomRepository extends JpaRepository<RoomEntity, Long> {
}

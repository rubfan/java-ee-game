package ua.od.game.controller;

import org.springframework.http.ResponseEntity;
import ua.od.game.dto.AccountBuildingDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface AccountBuildingController {

    List<AccountBuildingDto> getAccountBuildingsList(Integer accountId);
    ResponseEntity<?> clearAccountBuildingsList(Integer accountId);
    ResponseEntity<?> addBuildingToAccount(Integer accountId, Integer buildingId);
}

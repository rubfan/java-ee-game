package ua.od.game.controller;

import ua.od.game.dto.UpgradeProductDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface UpgradeProductController {
    List<UpgradeProductDto> getListOfUpgradeProducts();
}

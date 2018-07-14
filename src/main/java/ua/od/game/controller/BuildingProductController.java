package ua.od.game.controller;

import ua.od.game.dto.BuildingProductDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface BuildingProductController {
    List<BuildingProductDto> getBuildingResourcesList();
}

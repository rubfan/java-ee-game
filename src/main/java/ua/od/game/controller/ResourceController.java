package ua.od.game.controller;

import ua.od.game.dto.ResourceDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface ResourceController {
    List<ResourceDto> getListOfResources();
}

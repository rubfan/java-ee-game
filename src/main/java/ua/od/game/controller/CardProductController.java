package ua.od.game.controller;

import ua.od.game.dto.CardProductDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface CardProductController {
    List<CardProductDto> getListOfCardProducts();
}

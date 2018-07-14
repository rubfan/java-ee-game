package ua.od.game.controller;

import ua.od.game.dto.CardDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface CardController {
    List<CardDto> getCardList();
}

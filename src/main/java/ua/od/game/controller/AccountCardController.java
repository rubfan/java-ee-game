package ua.od.game.controller;

import org.springframework.http.ResponseEntity;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface AccountCardController {
    ResponseEntity<?> getAllowAccountCards(Integer accountId);
    ResponseEntity<?> cardApply(Integer accountId, Integer cardId);
}

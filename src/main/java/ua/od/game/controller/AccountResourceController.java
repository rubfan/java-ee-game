package ua.od.game.controller;

import ua.od.game.dto.AccountResourceDto;
import ua.od.game.dto.AccountResourceQuantityDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface AccountResourceController {
    List<AccountResourceDto> getAccountResourcesList(Integer accountId);
    List<AccountResourceQuantityDto> getAccountResourcesQuantity(Integer accountId);
}

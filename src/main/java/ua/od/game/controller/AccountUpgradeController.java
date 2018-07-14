package ua.od.game.controller;

import ua.od.game.dto.AccountUpgradeDto;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
public interface AccountUpgradeController {

    List<AccountUpgradeDto> getAccountUpgradeList(Integer accountId);
}

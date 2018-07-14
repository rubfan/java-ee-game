package ua.od.game.dto;

import lombok.Data;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Data
public class UpgradeProductDto {
    private Integer id;
    private UpgradeDto upgradeDto;
    private List<ResourceQuantityDto> resourceQuantityDtoList;
    private List<BuildingDto> buildingDtoList;
}

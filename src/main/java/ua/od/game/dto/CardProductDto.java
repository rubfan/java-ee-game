package ua.od.game.dto;

import lombok.Data;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Data
public class CardProductDto {
    private Integer id;
    private CardDto cardDto;
    private CardGroupDto cardGroupDto;
    private List<BuildingQuantityDto> p1BuildingQuantityDtoList;
    private List<BuildingQuantityDto> p2BuildingQuantityDtoList;
    private List<ResourceQuantityDto> p1ResourceQuantityDtoList;
    private List<ResourceQuantityDto> p2ResourceQuantityDtoList;
    private List<UpgradeQuantityDto> p1UpgradeQuantityDtoList;
    private List<UpgradeQuantityDto> p2UpgradeQuantityDtoList;
    private List<BuildingQuantityDto> necessaryBuildingQuantityDtoList;
    private List<UpgradeQuantityDto> necessaryUpgradeQuantityDtoList;
}

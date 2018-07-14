package ua.od.game.dto;

import lombok.Data;

import java.util.List;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Data
public class BuildingProductDto {
    private Integer id;
    private BuildingDto buildingDto;
    private List<ProductDto> productDtoList;
}

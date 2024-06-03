package main.java.service;

import main.java.dto.request.BuildingRequestDto;
import main.java.dto.response.BuildingResponseDto;

import java.math.BigDecimal;
import java.util.List;

public interface BuildingService {
    void save(List<BuildingRequestDto> buildingRequestDtoList);
    List<BuildingResponseDto> getAll();
    BigDecimal totalPriceForAllBuildings();
    BigDecimal totalPriceForHouse();
    BigDecimal totalPriceForVilla();
    BigDecimal totalPriceForSummerHouse();
    Double getAverageSquareMetersForAllBuildings();
    Double getAverageSquareMetersForHouse();
    Double getAverageSquareMetersForVilla();
    Double getAverageSquareMetersForSummerHouse();
    List<BuildingResponseDto> getBuildingsByRoomCountAndSaloonCount(Integer roomCount, Integer saloonCount);
}

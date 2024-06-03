package main.java.service;

import main.java.converter.BuildingConverter;
import main.java.dto.request.BuildingRequestDto;
import main.java.dto.response.BuildingResponseDto;
import main.java.factory.model.Building;
import main.java.model.enums.BuildingType;
import main.java.repository.BuildingRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class BuildingServiceImpl implements BuildingService {

    private final BuildingRepository buildingRepository;

    public BuildingServiceImpl(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    @Override
    public void save(List<BuildingRequestDto> buildingRequestDtoList) {
        List<Building> buildingList = BuildingConverter.toBuildingByBuildingRequestDto(buildingRequestDtoList);
        buildingRepository.save(buildingList);
    }

    @Override
    public List<BuildingResponseDto> getAll() {
        return BuildingConverter.toResponse(buildingRepository.getAll());
    }

    @Override
    public BigDecimal totalPriceForAllBuildings(){
        return getAll()
                .stream()
                .map(BuildingResponseDto::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public BigDecimal totalPriceForHouse(){
        return getAll()
                .stream()
                .filter(buildingResponseDto -> buildingResponseDto.getBuildingType().equals(BuildingType.HOUSE))
                .map(BuildingResponseDto::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public BigDecimal totalPriceForVilla(){
        return getAll()
                .stream()
                .filter(buildingResponseDto -> buildingResponseDto.getBuildingType().equals(BuildingType.VILLA))
                .map(BuildingResponseDto::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public BigDecimal totalPriceForSummerHouse(){
        return getAll()
                .stream()
                .filter(buildingResponseDto -> buildingResponseDto.getBuildingType().equals(BuildingType.SUMMERHOUSE))
                .map(BuildingResponseDto::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public Double getAverageSquareMetersForAllBuildings() {
        return getAll()
                .stream()
                .mapToDouble(BuildingResponseDto::getSquareMeters)
                .average()
                .orElse(Double.NaN);
    }

    @Override
    public Double getAverageSquareMetersForHouse() {
        return getAll()
                .stream()
                .filter(buildingResponseDto -> buildingResponseDto.getBuildingType().equals(BuildingType.HOUSE))
                .mapToDouble(BuildingResponseDto::getSquareMeters)
                .average()
                .orElse(Double.NaN);
    }

    @Override
    public Double getAverageSquareMetersForVilla() {
        return getAll()
                .stream()
                .filter(buildingResponseDto -> buildingResponseDto.getBuildingType().equals(BuildingType.VILLA))
                .mapToDouble(BuildingResponseDto::getSquareMeters)
                .average()
                .orElse(Double.NaN);
    }

    @Override
    public Double getAverageSquareMetersForSummerHouse() {
        return getAll()
                .stream()
                .filter(buildingResponseDto -> buildingResponseDto.getBuildingType().equals(BuildingType.SUMMERHOUSE))
                .mapToDouble(BuildingResponseDto::getSquareMeters)
                .average()
                .orElse(Double.NaN);
    }

    @Override
    public List<BuildingResponseDto> getBuildingsByRoomCountAndSaloonCount(Integer roomCount, Integer saloonCount) {
        return getAll()
                .stream()
                .filter(buildingResponseDto -> buildingResponseDto.getRoomCount().equals(roomCount)
                        && buildingResponseDto.getSaloonCount().equals(saloonCount))
                .collect(Collectors.toList());
    }
}

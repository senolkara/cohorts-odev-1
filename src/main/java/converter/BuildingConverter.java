package main.java.converter;

import main.java.dto.request.BuildingRequestDto;
import main.java.dto.response.BuildingResponseDto;
import main.java.factory.model.Building;
import main.java.factory.model.BuildingFactory;
import main.java.model.enums.BuildingType;
import main.java.util.GenerateRandomUnique;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BuildingConverter {

    private static Set<Long> buildingIdSet = new HashSet<>();

    public static List<Building> toBuildingByBuildingRequestDtoList(List<BuildingRequestDto> buildingRequestDtoList){
        List<Building> buildingList = new ArrayList<>();
        buildingRequestDtoList.forEach(buildingRequestDto -> {
            Long id = GenerateRandomUnique.createId(buildingIdSet);
            Building building = BuildingFactory.getBuilding(
                    id,
                    buildingRequestDto.getBuildingType(),
                    buildingRequestDto.getName(),
                    buildingRequestDto.getDescription(),
                    buildingRequestDto.getSquareMeters(),
                    buildingRequestDto.getRoomCount(),
                    buildingRequestDto.getSaloonCount(),
                    buildingRequestDto.getFloorCount(),
                    buildingRequestDto.getPrice()
            );
            buildingIdSet.add(building.getId());
            buildingList.add(building);
        });
        return buildingList;
    }

    public static BuildingResponseDto toBuildingResponseDtoByBuilding(Building building){
        BuildingResponseDto buildingResponseDto = new BuildingResponseDto();
        buildingResponseDto.setBuildingType(building.getBuildingType());
        buildingResponseDto.setName(building.getName());
        buildingResponseDto.setDescription(building.getDescription());
        buildingResponseDto.setSquareMeters(building.getSquareMeters());
        buildingResponseDto.setRoomCount(building.getRoomCount());
        buildingResponseDto.setSaloonCount(building.getSaloonCount());
        buildingResponseDto.setFloorCount(building.getFloorCount());
        buildingResponseDto.setPrice(building.getPrice());
        return buildingResponseDto;
    }

    public static List<BuildingResponseDto> toResponse(List<Building> buildingList) {
        return buildingList
                .stream()
                .map(BuildingConverter::toBuildingResponseDtoByBuilding)
                .collect(Collectors.toList());
    }
}

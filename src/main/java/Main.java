package main.java;

import main.java.dto.request.BuildingRequestDto;
import main.java.dto.response.BuildingResponseDto;
import main.java.repository.BuildingRepository;
import main.java.repository.BuildingRepositoryImpl;
import main.java.service.BuildingService;
import main.java.service.BuildingServiceImpl;
import main.java.util.createFakeBuilding;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BuildingRequestDto> buildingRequestDtoList = new ArrayList<>();
        buildingRequestDtoList.addAll(createFakeBuilding.getHouseList());
        buildingRequestDtoList.addAll(createFakeBuilding.getVillaList());
        buildingRequestDtoList.addAll(createFakeBuilding.getSummerHouseList());
        BuildingRepository buildingRepository = new BuildingRepositoryImpl();
        BuildingService buildingService = new BuildingServiceImpl(buildingRepository);
        buildingService.save(buildingRequestDtoList);
        System.out.println("Evlerin toplam fiyatları: " + buildingService.totalPriceForHouse());
        System.out.println("Villaların toplam fiyatları: " + buildingService.totalPriceForVilla());
        System.out.println("Yazlıkların toplam fiyatları: " + buildingService.totalPriceForSummerHouse());
        System.out.println("Tüm tipteki evlerin toplam fiyatları: " + buildingService.totalPriceForAllBuildings());
        System.out.println("Evlerin ortalama metrekaresi: " + buildingService.getAverageSquareMetersForHouse());
        System.out.println("Villaların ortalama metrekaresi: " + buildingService.getAverageSquareMetersForVilla());
        System.out.println("Yazlıkların ortalama metrekaresi: " + buildingService.getAverageSquareMetersForSummerHouse());
        System.out.println("Tüm tipteki evlerin ortalama metrekaresi: " + buildingService.getAverageSquareMetersForAllBuildings());
        System.out.println("--------------------------------------------");
        System.out.println("Oda ve salon sayısına göre tüm tipteki evler");
        System.out.println("--------------------------------------------");
        List<BuildingResponseDto> buildingsByRoomCountAndSaloonCountList = buildingService.getBuildingsByRoomCountAndSaloonCount(16, 8);
        buildingsByRoomCountAndSaloonCountList.forEach(buildingResponseDto -> {
            System.out.println(buildingResponseDto.getBuildingType());
            System.out.println(buildingResponseDto.getName());
            System.out.println(buildingResponseDto.getDescription());
            System.out.println(buildingResponseDto.getSquareMeters());
            System.out.println(buildingResponseDto.getRoomCount());
            System.out.println(buildingResponseDto.getSaloonCount());
            System.out.println(buildingResponseDto.getFloorCount());
            System.out.println(buildingResponseDto.getPrice());
        });
    }
}
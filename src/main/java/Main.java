package main.java;

import main.java.dto.request.BuildingRequestDto;
import main.java.dto.response.BuildingResponseDto;
import main.java.repository.BuildingRepository;
import main.java.repository.BuildingRepositoryImpl;
import main.java.service.BuildingService;
import main.java.service.BuildingServiceImpl;
import main.java.util.createFakeBuilding;

import java.text.DecimalFormat;
import java.text.NumberFormat;
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

        System.out.println("Evlerin toplam fiyatları: " + NumberFormat.getCurrencyInstance().format(buildingService.totalPriceForHouse()));
        System.out.println("Villaların toplam fiyatları: " + NumberFormat.getCurrencyInstance().format(buildingService.totalPriceForVilla()));
        System.out.println("Yazlıkların toplam fiyatları: " + NumberFormat.getCurrencyInstance().format(buildingService.totalPriceForSummerHouse()));
        System.out.println("Tüm tipteki evlerin toplam fiyatları: " + NumberFormat.getCurrencyInstance().format(buildingService.totalPriceForAllBuildings()));

        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Evlerin ortalama metrekaresi: " + formatter.format(buildingService.getAverageSquareMetersForHouse()));
        System.out.println("Villaların ortalama metrekaresi: " + formatter.format(buildingService.getAverageSquareMetersForVilla()));
        System.out.println("Yazlıkların ortalama metrekaresi: " + formatter.format(buildingService.getAverageSquareMetersForSummerHouse()));
        System.out.println("Tüm tipteki evlerin ortalama metrekaresi: " + formatter.format(buildingService.getAverageSquareMetersForAllBuildings()));

        System.out.println("--------------------------------------------");
        System.out.println("Oda ve salon sayısına göre tüm tipteki evler");
        System.out.println("--------------------------------------------");
        List<BuildingResponseDto> buildingsByRoomCountAndSaloonCountList = buildingService.getBuildingsByRoomCountAndSaloonCount(16, 8);
        buildingsByRoomCountAndSaloonCountList.forEach(buildingResponseDto -> {
            System.out.println("Yapı tipi: " + buildingResponseDto.getBuildingType());
            System.out.println("Yapı ismi: " + buildingResponseDto.getName());
            System.out.println("Yapı açıklaması: " + buildingResponseDto.getDescription());
            System.out.println("Yapı metrekaresi: " + buildingResponseDto.getSquareMeters());
            System.out.println("Oda sayısı: " + buildingResponseDto.getRoomCount());
            System.out.println("Salon sayısı: " + buildingResponseDto.getSaloonCount());
            System.out.println("Kat sayısı: " + buildingResponseDto.getFloorCount());
            System.out.println("Fiyatı:" + NumberFormat.getCurrencyInstance().format(buildingResponseDto.getPrice()));
        });
    }
}
package main.java.util;

import main.java.dto.request.BuildingRequestDto;
import main.java.model.enums.BuildingType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class createFakeBuilding {

    private createFakeBuilding(){}

    public static List<BuildingRequestDto> getHouseList(){
        List<BuildingRequestDto> buildingRequestDtoList = new ArrayList<>();

        BuildingRequestDto buildingRequestDto1 = new BuildingRequestDto();
        buildingRequestDto1.setBuildingType(BuildingType.HOUSE);
        buildingRequestDto1.setName("Sabancı Evi");
        buildingRequestDto1.setDescription("Sabancı ailesine ait ev");
        buildingRequestDto1.setSquareMeters(500);
        buildingRequestDto1.setRoomCount(10);
        buildingRequestDto1.setSaloonCount(5);
        buildingRequestDto1.setFloorCount(3);
        buildingRequestDto1.setPrice(BigDecimal.valueOf(10000000));
        buildingRequestDtoList.add(buildingRequestDto1);

        BuildingRequestDto buildingRequestDto2 = new BuildingRequestDto();
        buildingRequestDto2.setBuildingType(BuildingType.HOUSE);
        buildingRequestDto2.setName("Koç Evi");
        buildingRequestDto2.setDescription("Koç ailesine ait ev");
        buildingRequestDto2.setSquareMeters(600);
        buildingRequestDto2.setRoomCount(12);
        buildingRequestDto2.setSaloonCount(6);
        buildingRequestDto2.setFloorCount(3);
        buildingRequestDto2.setPrice(BigDecimal.valueOf(15000000));
        buildingRequestDtoList.add(buildingRequestDto2);

        BuildingRequestDto buildingRequestDto3 = new BuildingRequestDto();
        buildingRequestDto3.setBuildingType(BuildingType.HOUSE);
        buildingRequestDto3.setName("Ülker Evi");
        buildingRequestDto3.setDescription("Ülker ailesine ait ev");
        buildingRequestDto3.setSquareMeters(800);
        buildingRequestDto3.setRoomCount(16);
        buildingRequestDto3.setSaloonCount(8);
        buildingRequestDto3.setFloorCount(3);
        buildingRequestDto3.setPrice(BigDecimal.valueOf(20000000));
        buildingRequestDtoList.add(buildingRequestDto3);

        return buildingRequestDtoList;
    }

    public static List<BuildingRequestDto> getVillaList(){
        List<BuildingRequestDto> buildingRequestDtoList = new ArrayList<>();

        BuildingRequestDto buildingRequestDto1 = new BuildingRequestDto();
        buildingRequestDto1.setBuildingType(BuildingType.VILLA);
        buildingRequestDto1.setName("Sabancı Villası");
        buildingRequestDto1.setDescription("Sabancı ailesine ait villa");
        buildingRequestDto1.setSquareMeters(1000);
        buildingRequestDto1.setRoomCount(20);
        buildingRequestDto1.setSaloonCount(8);
        buildingRequestDto1.setFloorCount(2);
        buildingRequestDto1.setPrice(BigDecimal.valueOf(30000000));
        buildingRequestDtoList.add(buildingRequestDto1);

        BuildingRequestDto buildingRequestDto2 = new BuildingRequestDto();
        buildingRequestDto2.setBuildingType(BuildingType.VILLA);
        buildingRequestDto2.setName("Koç Villası");
        buildingRequestDto2.setDescription("Koç ailesine ait villa");
        buildingRequestDto2.setSquareMeters(1500);
        buildingRequestDto2.setRoomCount(28);
        buildingRequestDto2.setSaloonCount(10);
        buildingRequestDto2.setFloorCount(2);
        buildingRequestDto2.setPrice(BigDecimal.valueOf(38000000));
        buildingRequestDtoList.add(buildingRequestDto2);

        BuildingRequestDto buildingRequestDto3 = new BuildingRequestDto();
        buildingRequestDto3.setBuildingType(BuildingType.VILLA);
        buildingRequestDto3.setName("Ülker Villası");
        buildingRequestDto3.setDescription("Ülker ailesine ait villa");
        buildingRequestDto3.setSquareMeters(2500);
        buildingRequestDto3.setRoomCount(40);
        buildingRequestDto3.setSaloonCount(20);
        buildingRequestDto3.setFloorCount(2);
        buildingRequestDto3.setPrice(BigDecimal.valueOf(58000000));
        buildingRequestDtoList.add(buildingRequestDto3);

        return buildingRequestDtoList;
    }

    public static List<BuildingRequestDto> getSummerHouseList(){
        List<BuildingRequestDto> buildingRequestDtoList = new ArrayList<>();

        BuildingRequestDto buildingRequestDto1 = new BuildingRequestDto();
        buildingRequestDto1.setBuildingType(BuildingType.SUMMERHOUSE);
        buildingRequestDto1.setName("Sabancı Yazlığı");
        buildingRequestDto1.setDescription("Sabancı ailesine ait yazlık");
        buildingRequestDto1.setSquareMeters(1000);
        buildingRequestDto1.setRoomCount(20);
        buildingRequestDto1.setSaloonCount(8);
        buildingRequestDto1.setFloorCount(2);
        buildingRequestDto1.setPrice(BigDecimal.valueOf(30000000));
        buildingRequestDtoList.add(buildingRequestDto1);

        BuildingRequestDto buildingRequestDto2 = new BuildingRequestDto();
        buildingRequestDto2.setBuildingType(BuildingType.SUMMERHOUSE);
        buildingRequestDto2.setName("Koç Yazlığı");
        buildingRequestDto2.setDescription("Koç ailesine ait yazlık");
        buildingRequestDto2.setSquareMeters(1500);
        buildingRequestDto2.setRoomCount(28);
        buildingRequestDto2.setSaloonCount(10);
        buildingRequestDto2.setFloorCount(2);
        buildingRequestDto2.setPrice(BigDecimal.valueOf(38000000));
        buildingRequestDtoList.add(buildingRequestDto2);

        BuildingRequestDto buildingRequestDto3 = new BuildingRequestDto();
        buildingRequestDto3.setBuildingType(BuildingType.SUMMERHOUSE);
        buildingRequestDto3.setName("Ülker Yazlığı");
        buildingRequestDto3.setDescription("Ülker ailesine ait yazlık");
        buildingRequestDto3.setSquareMeters(2500);
        buildingRequestDto3.setRoomCount(40);
        buildingRequestDto3.setSaloonCount(20);
        buildingRequestDto3.setFloorCount(2);
        buildingRequestDto3.setPrice(BigDecimal.valueOf(58000000));
        buildingRequestDtoList.add(buildingRequestDto3);

        return buildingRequestDtoList;
    }
}

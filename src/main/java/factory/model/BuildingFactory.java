package main.java.factory.model;

import main.java.model.House;
import main.java.model.SummerHouse;
import main.java.model.Villa;
import main.java.model.enums.BuildingType;

import java.math.BigDecimal;

public class BuildingFactory {
    public static Building getBuilding(Long id,
                         BuildingType buildingType,
                         String name,
                         String description,
                         Integer squareMeters,
                         Integer roomCount,
                         Integer saloonCount,
                         Integer floorCount,
                         BigDecimal price){

        Building building = null;
        if (buildingType.equals(BuildingType.HOUSE)){
            building = new House(id, buildingType, name, description, squareMeters, roomCount, saloonCount, floorCount, price);
        } else if (buildingType.equals(BuildingType.VILLA)) {
            building = new Villa(id, buildingType, name, description, squareMeters, roomCount, saloonCount, floorCount, price);
        } else if (buildingType.equals(BuildingType.SUMMERHOUSE)) {
            building = new SummerHouse(id, buildingType, name, description, squareMeters, roomCount, saloonCount, floorCount, price);
        }
        return building;
    }
}

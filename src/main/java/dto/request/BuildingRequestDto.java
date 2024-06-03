package main.java.dto.request;

import main.java.model.enums.BuildingType;

import java.math.BigDecimal;

public class BuildingRequestDto {
    private BuildingType buildingType;
    private String name;
    private String description;
    private Integer squareMeters;
    private Integer roomCount;
    private Integer saloonCount;
    private Integer floorCount;
    private BigDecimal price;

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(Integer squareMeters) {
        this.squareMeters = squareMeters;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public Integer getSaloonCount() {
        return saloonCount;
    }

    public void setSaloonCount(Integer saloonCount) {
        this.saloonCount = saloonCount;
    }

    public Integer getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(Integer floorCount) {
        this.floorCount = floorCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

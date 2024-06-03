package main.java.model;

import main.java.factory.model.Building;
import main.java.model.enums.BuildingType;

import java.math.BigDecimal;

public class Villa implements Building {
    private Long id;
    private BuildingType buildingType;
    private String name;
    private String description;
    private Integer squareMeters;
    private Integer roomCount;
    private Integer saloonCount;
    private Integer floorCount;
    private BigDecimal price;

    public Villa(Long id,
                 BuildingType buildingType,
                 String name,
                 String description,
                 Integer squareMeters,
                 Integer roomCount,
                 Integer saloonCount,
                 Integer floorCount,
                 BigDecimal price) {
        this.id = id;
        this.buildingType = buildingType;
        this.name = name;
        this.description = description;
        this.squareMeters = squareMeters;
        this.roomCount = roomCount;
        this.saloonCount = saloonCount;
        this.floorCount = floorCount;
        this.price = price;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Integer getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(Integer squareMeters) {
        this.squareMeters = squareMeters;
    }

    @Override
    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    @Override
    public Integer getSaloonCount() {
        return saloonCount;
    }

    public void setSaloonCount(Integer saloonCount) {
        this.saloonCount = saloonCount;
    }

    @Override
    public Integer getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(Integer floorCount) {
        this.floorCount = floorCount;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id=" + id +
                ", buildingType=" + buildingType +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", squareMeters=" + squareMeters +
                ", roomCount=" + roomCount +
                ", saloonCount=" + saloonCount +
                ", floorCount=" + floorCount +
                ", price=" + price +
                '}';
    }
}

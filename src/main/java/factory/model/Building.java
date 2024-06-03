package main.java.factory.model;

import main.java.model.enums.BuildingType;

import java.math.BigDecimal;

public interface Building {
    Long getId();
    BuildingType getBuildingType();
    String getName();
    String getDescription();
    Integer getSquareMeters();
    Integer getRoomCount();
    Integer getSaloonCount();
    Integer getFloorCount();
    BigDecimal getPrice();
}

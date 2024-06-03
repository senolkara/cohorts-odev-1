package main.java.repository;

import main.java.factory.model.Building;

import java.util.List;

public interface BuildingRepository {
    void save(List<Building> buildingList);
    List<Building> getAll();
}

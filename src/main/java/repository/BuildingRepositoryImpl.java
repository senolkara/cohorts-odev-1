package main.java.repository;

import main.java.factory.model.Building;

import java.util.ArrayList;
import java.util.List;

public class BuildingRepositoryImpl implements BuildingRepository {

    private static List<Building> allBuildings = new ArrayList<>();

    @Override
    public void save(List<Building> buildingList) {
        allBuildings.addAll(buildingList);
    }

    @Override
    public List<Building> getAll() {
        return allBuildings;
    }
}

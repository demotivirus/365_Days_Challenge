package com.demotivirus.Day_119;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        Country country = new Country();
        Town town = new Town();
        Street street = new Street();
        Building building = new Building(89);

        world.addCountry(country);
        country.addTown(town);
        town.addStreet(street);
        street.addBuilding(building);
        System.out.println(world);
    }
}

package com.cgi.vehicleowner;

import java.util.ArrayList;

public class Owner {

    private String name;
    private ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();
    private int count;

    public Owner(String name) {
        this.name = name;
    }

    public int countByBrand(String brand) {
        for (Vehicle vehicle : this.vehicleArrayList) {
            if (vehicle.getBrand().equalsIgnoreCase(brand)) {
                count++;
            }
        }
        return count;
    }

    public void add(Vehicle v) {
        this.vehicleArrayList.add(v);
        System.out.println("Véhicule ajouté à la liste de " + this.name + " avec sa méthode add");
    }

    public void startAllVehicles() {
        for (Vehicle vehicle : this.vehicleArrayList) {
            System.out.println(vehicle.start());

            if (vehicle instanceof Boat) {
                ((Boat) vehicle).sail();
            } else if (vehicle instanceof Plane) {
                ((Plane) vehicle).fly();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehicle> getVehicleArrayList() {
        return vehicleArrayList;
    }

    public void setVehicleArrayList(ArrayList<Vehicle> vehicleArrayList) {
        this.vehicleArrayList = vehicleArrayList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", vehicleArrayList=" + vehicleArrayList +
                ", count=" + count +
                '}';
    }
}

package org.example;

import java.util.Objects;

public class PassangerPlane extends Plane{
    int floorsCount;

    public PassangerPlane(String name, Double weight, Double fuelConsumption, Double tankVol, int passangersCount, int floorsCount) {
        super(name, weight, fuelConsumption, tankVol, passangersCount);
        this.floorsCount = floorsCount;
    }

    public int floorsCount() {
        return floorsCount;
    }

    public PassangerPlane setFloorsCount(int floorsCount) {
        this.floorsCount = floorsCount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassangerPlane)) return false;
        if (!super.equals(o)) return false;
        PassangerPlane that = (PassangerPlane) o;
        return floorsCount == that.floorsCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), floorsCount);
    }

    @Override
    public void isReady() {
        System.out.println(this.name+" is ready");
    }

    @Override
    public String toString() {
        return "PassangerPlane{" +
                "floorsCount=" + floorsCount +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", fuelConsumption=" + fuelConsumption +
                ", tankVol=" + tankVol +
                ", passangersCount=" + passangersCount +
                '}';
    }
}

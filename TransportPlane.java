package org.example;

import java.util.Objects;

public class TransportPlane extends Plane{
    String companyOwner;
    Double weightPossibility;

    public TransportPlane(String name, Double weight, Double fuelConsumption, Double tankVol, int passangersCount, String companyOwner, Double weightPossibility) {
        super(name, weight, fuelConsumption, tankVol, passangersCount);
        this.companyOwner = companyOwner;
        this.weightPossibility = weightPossibility;
    }

    public String companyOwner() {
        return companyOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransportPlane)) return false;
        if (!super.equals(o)) return false;
        TransportPlane that = (TransportPlane) o;
        return Objects.equals(companyOwner, that.companyOwner) && Objects.equals(weightPossibility, that.weightPossibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), companyOwner, weightPossibility);
    }

    public TransportPlane setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
        return this;
    }

    @Override
    public String toString() {
        return "TransportPlane{" +
                "companyOwner='" + companyOwner + '\'' +
                ", weightPossibility=" + weightPossibility +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", fuelConsumption=" + fuelConsumption +
                ", tankVol=" + tankVol +
                ", passangersCount=" + passangersCount +
                '}';
    }

    public Double weightPossibility() {
        return weightPossibility;
    }

    @Override
    public void isReady() {
        System.out.println(this.name+" is ready");
    }

    public TransportPlane setWeightPossibility(Double weightPossibility) {
        this.weightPossibility = weightPossibility;
        return this;
    }
}

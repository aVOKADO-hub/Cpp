package org.example;

import java.util.Objects;

public class SportPlane extends Plane{
    String sponsor;

    public SportPlane(String name, Double weight, Double fuelConsumption, Double tankVol, int passangersCount, String sponsor) {
        super(name, weight, fuelConsumption, tankVol, passangersCount);
        this.sponsor = sponsor;
    }

    public String sponsor() {
        return sponsor;
    }

    public SportPlane setSponsor(String sponsor) {
        this.sponsor = sponsor;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportPlane)) return false;
        if (!super.equals(o)) return false;
        SportPlane that = (SportPlane) o;
        return Objects.equals(sponsor, that.sponsor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sponsor);
    }

    @Override
    public void isReady() {
        System.out.println(this.name+" is ready");
    }

    @Override
    public String toString() {
        return "SportPlane{" +
                "sponsor='" + sponsor + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", fuelConsumption=" + fuelConsumption +
                ", tankVol=" + tankVol +
                ", passangersCount=" + passangersCount +
                '}';
    }
}

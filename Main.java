package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Plane[] planes = new Plane[3];
        planes[0] = (new SportPlane("sportplane", 1.5, 400.0, 1200.0,0, "redbull"));
        planes[1] = (new TransportPlane("transportplane", 20.3, 600.0, 2500.0,0, "Ann", 60.0));
        planes[2] = (new PassangerPlane("passangersplane", 18.4, 550.0, 2000.0,300, 3));
        AirCompany company = new AirCompany(planes);
        company.SortForDistance(planes);
        System.out.println(company);
        company.PassangersCount(planes);
        company.SearchForConsumption(planes,600);
        for (var plane: planes){
            plane.isReady();
        }


    }
}
package org.example;

import java.util.Arrays;
import java.util.List;

public class AirCompany {
    Plane[]planes;

    public AirCompany(Plane[] planes) {
        this.planes = planes;
    }

    public Plane[] planes() {
        return planes;
    }

    public AirCompany setPlanes(Plane[] planes) {
        this.planes = planes;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirCompany)) return false;
        AirCompany that = (AirCompany) o;
        return Arrays.equals(planes, that.planes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(planes);
    }
    public void SortForDistance(Plane[]planes){
        for (int i =0;i<planes.length;i++){
            for(int j = 0; j<planes.length;j++){
                if ((planes[i].tankVol/planes[i].fuelConsumption)>(planes[j].tankVol/planes[j].fuelConsumption)){
                    var tmp = planes[i];
                    planes[i] = planes[j];
                    planes[j] = tmp;
                }
            }
        }
    }
    public void PassangersCount(Plane[]planes){
        int count =0;
        for (Plane plane:planes){
            count+= plane.passangersCount;
        }
        System.out.println(count+" passangers");
    }

    public void SearchForConsumption(Plane[]planes,double consumption){
        for (var plane: planes){
            if (plane.fuelConsumption==consumption){
                System.out.println("plane with "+consumption+" consumption is "+plane.name);
            }
        }
    }
    @Override
    public String toString() {
        return "AirCompany{" +
                "planes=" + Arrays.toString(planes) +
                '}';
    }
}

package day04;

public class GasStation {

    int fuelPrice;

    public GasStation(int fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public int tankCar(Car car, int liter){

        car.setFuel(liter);
        return liter*fuelPrice;
    }


}

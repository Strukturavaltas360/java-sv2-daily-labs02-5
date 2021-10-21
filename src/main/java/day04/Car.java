package day04;

public class Car {

    int fuel;
    int kmRun;

    public double calculateConsumption () {
        return ((fuel*1.0)/kmRun)*100;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setKmRun(int kmRun) {
        this.kmRun = kmRun;
    }
}

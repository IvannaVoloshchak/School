package сars;

public class TruckCar extends Car implements Truck {


    TruckCar (String name, int wheels, String licensePlate, Fuel fuel, int power) {
        this.name = name;
        this.wheels = wheels;
        this.licensePlate = licensePlate;
        this.fuel = fuel;
        this.power = power;

    }
    @Override
    public int getBaggage() {
        return 0;
    }
    @Override
    void drive(){
        consLogger.info("We are driving  NOT  so fast, but it has autopilot");
    }



    @Override
    public String toString() {
        return "TruckCar{" +
                "name='" + name + '\'' +
                ", wheels=" + wheels +
                ", licensePlate='" + licensePlate + '\'' +
                ", fuel=" + fuel +
                ", power=" + power +
                ", capacity = "+ capacity+
                '}';
    }
}

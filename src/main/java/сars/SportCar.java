package сars;

class SportCar extends Car implements Sport {


    SportCar(String name, int wheels, String licensePlate, Fuel fuel, int power) {
        this.name = name;
        this.wheels = wheels;
        this.licensePlate = licensePlate;
        this.fuel = fuel;
        this.power = power;

    }

    @Override
    public String toString() {
        return "SportCar{" +
                "name='" + name + '\'' +
                ", wheels=" + wheels +
                ", licensePlate='" + licensePlate + '\'' +
                ", fuel=" + fuel +
                ", power=" + power +
                ", airodynamic stuff"+ speedStuff+
                '}';
    }

    @Override
    void drive(){
        consLogger.info("We are driving fast");
    }

    @Override
    public void race() {
        consLogger.info("it can drive faster anyone car");
    }
    public void drift(){
        consLogger.info("We are drifting");
    }


}

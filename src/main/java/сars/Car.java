package сars;

import org.apache.log4j.Logger;

public abstract class Car {
    static Logger consLogger = Logger.getLogger("CONS");

    String name;
    int wheels;
    String licensePlate;
    Fuel fuel;
    int power;

    void drive() {
        consLogger.info("We are driving home!");
    }

    void turn(boolean right) {
        String side = right ? "right" : "left";
        consLogger.info("We are turning " + side);
    }

}


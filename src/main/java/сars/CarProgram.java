package сars;

import org.apache.log4j.PropertyConfigurator;

public class CarProgram {

    public static void main(String[] args) {
        String log4jConfPath = "C:\\Users\\User\\Project\\src\\main\\resources\\log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);

        Sport bullitt = new SportCar("Ferrari",4,"JDK-11", Fuel.GASOLINE, 500);
        Car teslaSemi= new TruckCar("Semi", 12, "JRE 14", Fuel.ELECTRISITY, 300);
        ((Car) bullitt).drive();
        ((SportCar) bullitt).drift();
        ((Car)bullitt).turn(true);
        ((SportCar) bullitt).race();
        teslaSemi.drive();
        teslaSemi.turn(false);
        ((TruckCar) teslaSemi).getBaggage();
        System.out.println(bullitt);
        System.out.println(teslaSemi);
    }
}

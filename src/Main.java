public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1");
        Car car2 = new Car("car2");

        Truck truck = new Truck("truck1", 4);
        ServiceStation serviceStation = new ServiceStation();

        serviceStation.check(truck);
        serviceStation.check(car);
        serviceStation.check(car2);


        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        serviceStation.check(bicycle2);
        serviceStation.check(bicycle);
    }
}

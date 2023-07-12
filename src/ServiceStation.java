public class ServiceStation implements Service {
    public static void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            vehicle.service();
        }
    }
}



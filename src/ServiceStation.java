public class ServiceStation implements Service {
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            vehicle.service();
        }
    }
}



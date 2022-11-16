package Racing;

import Racing.Transport.Car;
import Racing.Transport.Transport;
import Racing.Transport.Truck;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transports = new LinkedList<>();

    public void addAutoServiceAll(Transport... transports) {
        for (Transport transport : transports) {
            addAutoService(transport);
        }
    }
    public void addAutoService(Transport transport) {
        if (transport instanceof Car && !transport.diagnostics() || transport instanceof Truck && !transport.diagnostics() ) {
            System.out.println("Автомобиль: " + transport.getBrand() + " " + transport.getModel() + " встал в очередь на диагностику");
            transports.offer(transport);
        }
    }

    public void service() {
        for (Transport transport : transports) {
            System.out.println("Автомобилю " + transport.getBrand() + " " + transport.getModel() + " провели диагностику");
            transports.peek();
        }
    }
}

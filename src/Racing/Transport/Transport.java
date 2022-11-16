package Racing.Transport;
import Racing.Driver.Driver;
import Racing.Driver.DriverСategoryB;
import Racing.ValidationUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport  implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private final List <Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();
    private final List<Transport> transports = List.of();

    public Transport(String brand, String model, double engineVolume) {
        this.brand = ValidationUtils.Validation(brand, "Информация Отсутствует");
        this.model = ValidationUtils.Validation(model, "Информация Отсутствует");
        setEngineVolume(engineVolume);
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume >= 0 ? engineVolume : 1.5;
    }
    public void startMoving() {
        System.out.println(getBrand() + " " + getModel() + " - Начать движение");
    }
    public void endMovement() {
        System.out.println(getBrand() + " " + getModel() + " - Закончить движение");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " заходит на пит-стоп!");
    }
    @Override
    public void bestLapTime() {
        int timeLap1 = 3 + (int) ( Math.random() * 2 );
        int timeLap2 = (int) ( Math.random() * 60 );
        System.out.printf("%s %s, лучшее время круга: %d:%d \n", getBrand(),getModel(),timeLap1,timeLap2);
    }
    @Override
    public void maximumSpeed() {
        int maxSpeed = 80 + (int) ( Math.random() * 100 );
        System.out.printf("%s %s, максимальная скорость: %d км/ч \n",getBrand(),getModel(),maxSpeed);
    }
    @Override
    public void printTypeAuto() {

    }
    public  boolean diagnostics() {
        return true;
    }

    public static void allDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            allDiagnosticsCheck(transport);
        }
    }

    public static void allDiagnosticsCheck(Transport transport) {
        try {
            if (!transport.diagnostics()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " НЕ ПРОШЕЛ диагностику!!!");
            } else {
                System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " в диагностике не нуждается");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void  addDriver  (Driver<?> driver) {
        drivers.add(driver);
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public static void addTransport(Transport... transports) {
        List.of(transports);
    }


    public static void printAllInformation(Transport... transports) {
        for (Transport transport : transports) {
            printAll(transport);
        }
    }

    public static void printAll(Transport transport) {
        System.out.println(transport.toString());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(drivers, transport.drivers) && Objects.equals(mechanics, transport.mechanics) && Objects.equals(sponsors, transport.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, drivers, mechanics, sponsors);
    }

    @Override
    public String toString() {
        return "Автомобиль: " + brand + " " + model + "\n" +"Водитель: "+ drivers + "\n" +"Механики: "+ mechanics + "\n" +"Спонсоры: "+ sponsors + "\n";
    }
}

package Racing.Driver;

import Racing.Transport.Transport;
import Racing.ValidationUtils;

public abstract class Driver <D extends Transport> implements RaceDriver {
    private D transport;
    private final String name;
    private final String surname;
    private final String middleName;
    private String driversLicense;
    private int experience;

    public Driver(String surname, String name, String middleName, String driversLicense, int experience,D transport) {
        this.name = ValidationUtils.Validation(name, "Черная");
        this.surname = ValidationUtils.Validation(surname, "Лошадка");
        this.middleName = ValidationUtils.Validation(middleName, " ");
        this.driversLicense = driversLicense;
        this.experience = experience;
        this.transport = transport;
    }

    public void driverInformation() {
        System.out.printf("%s %s управляет автомобилем %s %s и будет участвовать в заезде \n",getSurname(),getName(),transport.getBrand(),transport.getModel());
    }

    public D getTransport() {
        return transport;
    }

    public void setTransport(D transport) {
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = ValidationUtils.Validation(driversLicense, "B");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience >= 0 ? experience : 1;
    }

    @Override
    public void startMoving() {
        System.out.println("Начать движение");
    }

    @Override
    public void stop() {
        System.out.println("Остановиться");
    }

    @Override
    public void refuel() {
        System.out.println("Заправить авто");
    }
}

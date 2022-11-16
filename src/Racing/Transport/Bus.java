package Racing.Transport;
import Racing.Driver.Capacity;
import Racing.Driver.Driver;
import Racing.Driver.DriverСategoryB;
import Racing.Driver.DriverСategoryD;

public class Bus extends Transport{
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        setCapacity(capacity);
    }
    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void printTypeAuto() {
        System.out.printf("Автобус: %s %s, вместимость: %.0f человек\n",getBrand(),getModel(),capacity.getTo());
    }

    @Override
    public boolean diagnostics() {
        return true;
    }
    @Override
    public void addDriver(Driver<?> driver) {
        if (driver instanceof DriverСategoryD) {
            if (getBrand().equals(driver.getTransport().getBrand())) {
                System.out.printf("У автомобиля: %s %s появился водитель - %s %s\n", getBrand(), getModel(), driver.getName(), driver.getSurname());
                super.addDriver(driver);
            } else {
                throw new IllegalArgumentException("Водитель управляет другим автомобилем");
            }
        } else {
            throw new IllegalArgumentException("У водителя нет нужной категории прав!");
        }
    }
}

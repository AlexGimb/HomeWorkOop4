package Racing.Transport;
import Racing.Driver.Capacity;

public class Bus extends Transport{
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        setCapacity(capacity);
    }
    @Override
    public void printTypeAuto() {
        System.out.printf("Автомобиль: %s %s, вместимость: %.0f человек\n",getBrand(),getModel(),capacity.getTo());
    }
    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}

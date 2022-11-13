package Racing.Transport;
import Racing.Driver.Weight;

public class Truck extends Transport{
    private Weight weight;
    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        setWeight(weight);
    }
    @Override
    public void printTypeAuto() {
        System.out.printf("Автомобиль: %s %s, грузоподъемность: от %.1f до %.1f тонн \n",getBrand(),getModel(),weight.getFrom(),weight.getTo());
    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.5;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }
}

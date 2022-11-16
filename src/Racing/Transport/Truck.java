package Racing.Transport;
import Racing.Driver.Driver;
import Racing.Driver.DriverСategoryB;
import Racing.Driver.DriverСategoryС;
import Racing.Driver.Weight;

import java.util.ArrayList;
import java.util.Arrays;

public class Truck extends Transport{
    private Weight weight;
    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        setWeight(weight);
    }
    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void printTypeAuto() {
        System.out.printf("Автомобиль: %s %s, грузоподъемность: от %.1f до %.1f тонн \n",getBrand(),getModel(),weight.getFrom(),weight.getTo());
    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.5;
    }
    @Override
    public void addDriver(Driver<?> driver) {
        if (driver instanceof DriverСategoryС) {
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

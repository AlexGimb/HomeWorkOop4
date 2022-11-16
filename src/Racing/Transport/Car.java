package Racing.Transport;
import Racing.Driver.Body;
import Racing.Driver.Driver;
import Racing.Driver.DriverСategoryB;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Car extends Transport{
    private Body body;
    public Car(String brand, String model, double engineVolume, Body body) {
        super(brand, model, engineVolume);
        setBody(body);
    }
    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public void printTypeAuto() {
        System.out.printf("Автомобиль: %s %s, тип кузова авто: %s \n",getBrand(),getModel(),body.getBodyType());
    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.5;
    }

    @Override
    public void addDriver(Driver<?> driver) {
        if (driver instanceof DriverСategoryB) {
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

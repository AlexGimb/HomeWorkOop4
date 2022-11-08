package Racing.Transport;

import Racing.ValidationUtils;

public class Transport implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;

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
}

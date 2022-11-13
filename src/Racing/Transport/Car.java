package Racing.Transport;
import Racing.Driver.Body;
import Racing.Main;

public class Car extends Transport{
    private Body body;
    public Car(String brand, String model, double engineVolume, Body body) {
        super(brand, model, engineVolume);
        setBody(body);

    }

    @Override
    public void printTypeAuto() {
        System.out.printf("Автомобиль: %s %s, тип кузова авто: %s \n",getBrand(),getModel(),body.getBodyType());
    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.5;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

}

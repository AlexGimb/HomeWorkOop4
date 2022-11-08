package Racing;

import Racing.Driver.DriverСategoryB;
import Racing.Driver.DriverСategoryD;
import Racing.Driver.DriverСategoryС;
import Racing.Transport.Bus;
import Racing.Transport.Car;
import Racing.Transport.Truck;

public class Main {
    public static void main(String[] args) {
        ///////////////////////////////////////////Легковые/////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");
        Car lada = new Car("Лада", "Гранта", 1.6);
        Car gaz = new Car("Газ", "Волга", 2.4);
        Car vaz = new Car("Ваз", "2101-Копейка", 1.3);
        Car moscvich = new Car("Москвич", "Комби", 1.4);
        lada.startMoving();
        gaz.endMovement();
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Грузовые/////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");
        Truck kamaz = new Truck("Камаз", "3141", 7.2);
        Truck volvo = new Truck("Вольво", " ", 7.4);
        Truck scania = new Truck("Скания", "5525", 8.2);
        Truck mercedes = new Truck("Мерседес", "8451", 8.0);
        kamaz.pitStop();
        volvo.bestLapTime();
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Автобусы/////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");
        Bus paz = new Bus("Паз", "8100", 5.4);
        Bus ford = new Bus("Форд", "Транзит", 0);
        Bus peugeot = new Bus("Пежо", "Боксер", 2.2);
        Bus fiat = new Bus("Фиат", "Дукато", 3.5);
        paz.maximumSpeed();
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Автобусы/////////////////////////////////////////////////////////////
        DriverСategoryB ivanov = new DriverСategoryB("Иванов", "Петр", "Алексеевич", "B", 10,vaz);
        DriverСategoryС noname = new DriverСategoryС("", "", "", "С", 5, scania);
        DriverСategoryD filimonov = new DriverСategoryD("Филимонов", "Андрей", "Викторович", "D", 20, peugeot);
        ivanov.driverInformation();
        noname.driverInformation();
        filimonov.driverInformation();
        ivanov.refuel();
    }
}
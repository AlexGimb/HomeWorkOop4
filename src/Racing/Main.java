package Racing;

import Racing.Driver.*;
import Racing.Transport.Bus;
import Racing.Transport.Car;
import Racing.Transport.Transport;
import Racing.Transport.Truck;

public class Main {
    public static void main(String[] args) {
        ///////////////////////////////////////////Легковые/////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");
        Car lada = new Car("Лада", "Гранта", 1.6, Body.SEDAN);
        Car gaz = new Car("Газ", "Волга", 2.4, Body.SEDAN);
        Car vaz = new Car("Ваз", "2101-Копейка", 1.3, Body.SEDAN);
        Car moscvich = new Car("Москвич", "Комби", 1.4, Body.UNIVERSAL);
        lada.startMoving();
        gaz.endMovement();
        vaz.printTypeAuto();
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Грузовые/////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");
        Truck kamaz = new Truck("Камаз", "3141", 7.2, Weight.N2);
        Truck volvo = new Truck("Вольво", " ", 7.4, Weight.N2);
        Truck scania = new Truck("Скания", "5525", 8.2, Weight.N3);
        Truck mercedes = new Truck("Мерседес", "8451", 8.0, Weight.N1);
        kamaz.pitStop();
        volvo.bestLapTime();
        scania.printTypeAuto();
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Автобусы/////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");
        Bus paz = new Bus("Паз", "8100", 5.4,Capacity.LARGE);
        Bus ford = new Bus("Форд", "Транзит", 0,Capacity.SMALL);
        Bus peugeot = new Bus("Пежо", "Боксер", 2.2,Capacity.SMALL);
        Bus fiat = new Bus("Фиат", "Дукато", 3.5,Capacity.SMALL);
        paz.maximumSpeed();
        fiat.printTypeAuto();
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Автобусы/////////////////////////////////////////////////////////////
        DriverСategoryB ivanov = new DriverСategoryB("Иванов", "Петр", "Алексеевич", "B", 10,vaz);
        DriverСategoryС noname = new DriverСategoryС("", "", "", "C", 5, scania);
        DriverСategoryD filimonov = new DriverСategoryD("Филимонов", "Андрей", "Викторович", "D", 20, peugeot);
        ivanov.driverInformation();
        noname.driverInformation();
        filimonov.driverInformation();
        ivanov.refuel();
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Данные///////////////////////////////////////////////////////////////
        boolean test = Date.validate("Login", "Login123", "Login123");
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Диагностика//////////////////////////////////////////////////////////
        Transport.allDiagnostics(
                lada, gaz, vaz, moscvich,
                kamaz, volvo, scania, mercedes,
                paz, ford, peugeot, fiat
        );
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
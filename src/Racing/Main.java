package Racing;

import Racing.Driver.*;
import Racing.Transport.*;

import java.util.List;

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
        System.out.println("------------------------------------------------------------------------------------------");
        DriverСategoryB ivanov = new DriverСategoryB("Иванов", "Петр", "Алексеевич", "B", 10,vaz);
        DriverСategoryB durov = new DriverСategoryB("Дуров", "Павел", "Федорович", "B", 10,gaz);
        DriverСategoryС noname = new DriverСategoryС("", "", "", "C", 5, scania);
        DriverСategoryС derzkiy = new DriverСategoryС("Дерзкий", "Паша", "Сергеевич", "C", 5, mercedes);
        DriverСategoryD filimonov = new DriverСategoryD("Филимонов", "Андрей", "Викторович", "D", 20, peugeot);
        DriverСategoryD zuganov = new DriverСategoryD("Зюганов", "Петр", "Фадеевич", "D", 20, ford);
        ivanov.driverInformation();
        noname.driverInformation();
        filimonov.driverInformation();
        ivanov.refuel();
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Данные///////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");
        boolean test = Date.validate("Login", "Login123", "Login123");
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Диагностика//////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");
        Transport.allDiagnostics(
                lada, gaz, vaz, moscvich,
                kamaz, volvo, scania, mercedes,
                paz, ford, peugeot, fiat);
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Механики/////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");
        Mechanic<Car> petrovM = new Mechanic<Car>("Михаил", "Петров", "Крутим Вертим");
        Mechanic<Car> petrovI = new Mechanic<Car>("Иван", "Петров", "Крутим Вертим");
        Mechanic<Car> drobishev = new Mechanic<Car>("Виктор", "Дробышев", "Лучше чем было");
        Mechanic<Car> ignatenko = new Mechanic<Car>("Александр", "Игнатенко", "Лучше чем было");
        Mechanic<Truck> vasilev = new Mechanic<Truck>("Игорь", "Васильев", "Жара");
        Mechanic<Truck> vavilov = new Mechanic<Truck>("Владимир", "Вавилов", "Жара");
        Mechanic<Truck> zhiglov = new Mechanic<Truck>("Константин", "Жиглов", "Свое Дело");
        Mechanic<Truck> haritonov = new Mechanic<Truck>("Ян", "Харитонов", "Свое Дело");
        Mechanic<Bus> saharov = new Mechanic<Bus>("Андрей", "Сахаров", "Колесо");
        Mechanic<Bus> yarishev = new Mechanic<Bus>("Станислав", "Ярышев", "Колесо");
        Mechanic<Bus> vartanov = new Mechanic<Bus>("Жорик", "Вартанов", "Иуу");
        Mechanic<Bus> magamedov = new Mechanic<Bus>("Магамед", "Магамедов", "Иуу");
        petrovI.maintenance(vaz);
        petrovI.fixCar(vaz);
        vasilev.maintenance(scania);
        vasilev.fixCar(scania);
        saharov.maintenance(paz);
        saharov.fixCar(paz);
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Спонсоры/////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");
        Sponsor<Transport> andreevich = new Sponsor<>("Сильвестр Андреевич", 1_400_000.00);
        Sponsor<Transport> pavlovich = new Sponsor<>("Виктор Павлович", 1_800_000.00);
        Sponsor<Transport> abdurahmanovich = new Sponsor<>("Рашид Абдурахманович", 1_300_000.00);
        Sponsor<Transport> michailovich = new Sponsor<>("Александр Михалович", 1_100_000.00);
        Sponsor<Transport> gazprom = new Sponsor<>("Газпром", 1_200_000.00);
        Sponsor<Transport> pelmeni = new Sponsor<>("Уральские пельмени", 1_700_000.00);
        Sponsor<Transport> vkusno = new Sponsor<>("Вкусно и почка", 1_500_000.00);
        Sponsor<Transport> durex = new Sponsor<>("Шинный центр Дюрекс", 1_600_000.00);
        Sponsor<Transport> pirelli = new Sponsor<>("Пирелли", 1_450_000.00);
        Sponsor<Transport> starLink = new Sponsor<>("Старлинк", 1_900_000.00);
        Sponsor<Transport> baba = new Sponsor<>("Баба Валя из 5-го подьезда", 2_600_000.00);
        Sponsor<Transport> pivo = new Sponsor<>("Пиво Пей", 1_720_000.00);
        michailovich.toSponsor(mercedes);
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Листы////////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");

        Transport.addTransport(lada, gaz, vaz, moscvich,
                kamaz, volvo, scania, mercedes,
                paz, ford, peugeot, fiat);

        vaz.addDriver(ivanov);
        vaz.addMechanic(petrovM, petrovI);
        vaz.addSponsor(andreevich, pavlovich);

        gaz.addDriver(durov);
        gaz.addMechanic(drobishev, ignatenko);
        gaz.addSponsor(abdurahmanovich, michailovich);

        scania.addDriver(noname);
        scania.addMechanic(vasilev, vavilov);
        scania.addSponsor(gazprom, pelmeni);

        mercedes.addDriver(derzkiy);
        mercedes.addMechanic(zhiglov, haritonov);
        mercedes.addSponsor(vkusno, durex);

        peugeot.addDriver(filimonov);
        peugeot.addMechanic(saharov, yarishev);
        peugeot.addSponsor(pirelli, starLink);

        ford.addDriver(zuganov);
        ford.addMechanic(vartanov, magamedov);
        ford.addSponsor(baba, pivo);
        System.out.println();
        Transport.printAllInformation(gaz, vaz,
                scania, mercedes,
                ford, peugeot);
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Станция ТО///////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addAutoServiceAll(lada, gaz, vaz, moscvich,
                kamaz, volvo, scania, mercedes,
                paz, ford, peugeot, fiat);
        serviceStation.service();
        System.out.println("------------------------------------------------------------------------------------------");
        ///////////////////////////////////////////Касса магазина///////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------------------");

    }
}
package Racing.Driver;
import Racing.Transport.Transport;
import Racing.Transport.Truck;
public class DriverСategoryС extends Driver <Truck>{

    public DriverСategoryС(String surname, String name, String middleName, String driversLicense, int experience, Truck transport) {
        super(surname, name, middleName, driversLicense, experience, transport);
    }
}

package Racing.Transport;

import Racing.ValidationUtils;

import java.util.Objects;

public class Mechanic <M extends Transport>  {
    private final String name;
    private final String surname;
    private String company;
    private M transport;

    public Mechanic(String name, String surname, String company) {
        this.name = ValidationUtils.Validation(name, "Информация отсутствует");
        this.surname = ValidationUtils.Validation(surname, "Информация отсутствует");
        setCompany(company);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = ValidationUtils.Validation(company, "Информация отсутствует");
    }

    public M getTransport() {
        return transport;
    }

    public void setTransport(M transport) {
        this.transport = transport;
    }

    public void maintenance(M transport) {
        if (!transport.diagnostics()) {
            System.out.printf("Механик %s %s проводит техническое обслуживание автомобиля: %s %s\n", getName(), getSurname(),transport.getBrand(),transport.getModel());
        }
    }
    public void fixCar(M transport) {
        System.out.printf("Механик %s %s ремонтирует автомобиль: %s %s\n",getName(),getSurname(),transport.getBrand(),transport.getModel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(surname, mechanic.surname) && Objects.equals(company, mechanic.company) && Objects.equals(transport, mechanic.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company, transport);
    }

    @Override
    public String toString() {
        return name + " " + surname +
                ", Компания: " + company;
    }
}

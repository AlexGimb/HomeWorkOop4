package Racing.Transport;

import Racing.Transport.Transport;
import Racing.ValidationUtils;

import java.util.Objects;

public class Sponsor <S extends Transport> {
    private final String name;
    private double amount;
    private S transport;

    public Sponsor(String name, double amount) {
        this.name = ValidationUtils.Validation(name, "Аноним");
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = Math.abs(amount);
    }

    public void toSponsor(S transport) {
        System.out.printf("%s проспонсировал заезд %s %s на сумму %.2f рублей\n", name, transport.getBrand(),transport.getModel(), amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor<?> sponsor = (Sponsor<?>) o;
        return Double.compare(sponsor.amount, amount) == 0 && Objects.equals(name, sponsor.name) && Objects.equals(transport, sponsor.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, transport);
    }

    @Override
    public String toString() {
        return name;
    }
}

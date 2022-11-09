package Racing.Driver;

public enum Weight {
    N1(0, 3.5),
    N2(3.5,12),
    N3(12, 20);

    private double from;
    private double to;

    Weight(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}

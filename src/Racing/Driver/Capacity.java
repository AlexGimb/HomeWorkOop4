package Racing.Driver;

public enum Capacity {
    EXTRA_SMALL(10),
    SMALL(25),
    MEDIUM(40,50),
    LARGE(60,80),
    ESPECIALLY_LARGE(100,120);

    private int from;
    private final int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    Capacity(int to) {
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}

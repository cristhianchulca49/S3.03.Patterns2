package Level2.domain.stock;

public enum StockState {
    UP,
    DOWN,
    UNDEFINED,
    STABLE;

    public static StockState determinateState(double newPrice, double currentPrice) {
        int comparison = Double.compare(newPrice, currentPrice);
        if (comparison > 0) return UP;
        if (comparison < 0) return DOWN;
        return STABLE;
    }
}

package Level2.domain.agency;

import Level2.domain.observer.Observer;
import Level2.domain.stock.StockState;

public class StockBrokerAgency implements Observer {

    private final String name;
    private StockState state;
    private double price;

    private static final String TEMPLATE =
            "%s received notification: Stock market went %s | Current Value: $%.2f";

    public StockBrokerAgency(String name) {
        this.name = name;
        this.state = StockState.UNDEFINED;
    }

    @Override
    public void update(StockState state, double price) {
        this.state = state;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(TEMPLATE, name, state.name(), price);
    }

    public StockState getState() {
        return state;
    }

    public double getPrice() {
        return price;
    }
}
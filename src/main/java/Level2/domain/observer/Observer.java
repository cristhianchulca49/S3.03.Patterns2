package Level2.domain.observer;

import Level2.domain.stock.StockState;

public interface Observer {
    void update(StockState state, double price);
}

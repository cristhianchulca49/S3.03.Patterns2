package Level2.domain.observer;

import Level2.domain.agency.StockState;

public interface Observer {
    void update(StockState state, double price);
}

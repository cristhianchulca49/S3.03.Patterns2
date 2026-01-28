package Level2.domain.stock;

import Level2.domain.observer.Observer;
import Level2.domain.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private double currentPrice;
    private StockState status;

    public StockAgent() {
        this.currentPrice = 0.0;
        this.status = StockState.UNDEFINED;
    }

    public List<Observer> getObservers() {
        return List.copyOf(observers);
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public StockState getStatus() {
        return status;
    }

    public void updateMarketPrice(double newPrice) {
        if (newPrice > currentPrice) {
            this.status = StockState.UP;
        } else if (newPrice < currentPrice) {
            this.status = StockState.DOWN;
        }
        currentPrice = newPrice;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        if (observer != null) observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(status, currentPrice));
    }
}

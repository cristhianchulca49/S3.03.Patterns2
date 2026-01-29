import Level2.domain.agency.StockBrokerAgency;
import Level2.domain.observer.Observer;
import Level2.domain.stock.StockAgent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestObserver {


    @Test
    public void testStockAgentNotifications() {

        StockAgent agent = new StockAgent();
        Observer alphaBrokers = new StockBrokerAgency("Alpha Brokers");

        agent.addObserver(alphaBrokers);

        agent.updateMarketPrice(150.75);
        String actualUpMessage = alphaBrokers.toString();

        agent.updateMarketPrice(145.50);
        String actualDownMessage = alphaBrokers.toString();

        String expectedUpMessage = "Alpha Brokers received notification: Stock market went UP | Current Value: $150.75";
        String expectedDownMessage = "Alpha Brokers received notification: Stock market went DOWN | Current Value: $145.50";

        assertEquals(expectedUpMessage, actualUpMessage);
        assertEquals(expectedDownMessage, actualDownMessage);
    }

    @Test
    public void defaultObserverState() {
        StockAgent agent = new StockAgent();

        Observer alphaBrokers = new StockBrokerAgency("Alpha Brokers");
        String actualMessage = alphaBrokers.toString();
        String expectedMessage = "Alpha Brokers received notification: Stock market went UNDEFINED | Current Value: $0.00";

        assertEquals(expectedMessage, actualMessage);

    }
}
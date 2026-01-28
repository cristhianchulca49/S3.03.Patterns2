import Level2.domain.agency.StockBrokerAgency;
import Level2.domain.observer.Observer;
import Level2.domain.stock.StockAgent;
import org.junit.jupiter.api.Test;

public class TestObserver {
    @Test
    public void testStockAgentNotifications() {
        StockAgent agent = new StockAgent();
        Observer alphaBrokers = new StockBrokerAgency("Alpha Brokers");
        Observer zenithInvestments = new StockBrokerAgency("Zenith Investments");

        agent.addObserver(alphaBrokers);


        agent.removeObserver(zenithInvestments);

    }
}
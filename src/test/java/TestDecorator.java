import Level3.domain.builder.BubbleTeaBuilder;
import Level3.domain.model.BubbleTea;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDecorator {
    @Test
    public void testFullBubbleTea() {
        BubbleTea latteFull = BubbleTeaBuilder.latte()
                .withIce()
                .withTapioca()
                .withFlavor("Banana")
                .withFlavor("Apple")
                .build();

        String expectedDescription = "Latte: 3.50€ + Ice: 0.25€ + Tapioca: 0.50€ + Flavor (Banana): 0.60€ + Flavor (Apple): 0.60€ ";
        BigDecimal expectedPrice = new BigDecimal("5.45");

        assertEquals(expectedDescription, latteFull.getDescription());
        assertEquals(expectedPrice, latteFull.getPrice());
    }
}
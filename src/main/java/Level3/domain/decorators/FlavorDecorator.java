package Level3.domain.decorators;

import Level3.domain.model.BubbleTea;
import Level3.domain.model.BubbleTeaDecorator;

import java.math.BigDecimal;

public class FlavorDecorator extends BubbleTeaDecorator {
    private final String flavor;

    protected FlavorDecorator(BubbleTea bubbleTea, String flavor) {
        super(bubbleTea);
        this.flavor = flavor;
    }

    @Override
    public BigDecimal getPrice() {
        return bubbleTea.getPrice().add(BigDecimal.valueOf(0.60));
    }

    @Override
    public String getDescription() {
        return String.format("%s+ Flavor (%s): 0.60", bubbleTea.getDescription(), flavor);
    }
}

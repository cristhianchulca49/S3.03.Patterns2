package Level3.domain.decorators;

import Level3.domain.model.BubbleTea;
import Level3.domain.model.BubbleTeaDecorator;

import java.math.BigDecimal;

public class TapiocaDecorator extends BubbleTeaDecorator {
    public TapiocaDecorator(BubbleTea bubbleTea) {
        super(bubbleTea);
    }

    @Override
    public BigDecimal getPrice() {
        return bubbleTea.getPrice().add(BigDecimal.valueOf(0.50));
    }

    @Override
    public String getDescription() {
        return bubbleTea.getDescription() + "+ Tapioca: 0.50€ ";
    }
}

package Level3.domain.decorators;

import Level3.domain.model.BubbleTea;
import Level3.domain.model.BubbleTeaDecorator;

import java.math.BigDecimal;

public class SugarDecorator extends BubbleTeaDecorator {
    protected SugarDecorator(BubbleTea bubbleTea) {
        super(bubbleTea);
    }

    @Override
    public BigDecimal getPrice() {
        return bubbleTea.getPrice().add(BigDecimal.valueOf(0.50));
    }

    @Override
    public String getDescription() {
        return bubbleTea.getDescription() + "+ Sugar: 0.50€";
    }
}
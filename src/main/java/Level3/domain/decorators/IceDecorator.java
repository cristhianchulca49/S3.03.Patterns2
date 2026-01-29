package Level3.domain.decorators;

import Level3.domain.model.BubbleTea;
import Level3.domain.model.BubbleTeaDecorator;

import java.math.BigDecimal;

public class IceDecorator extends BubbleTeaDecorator {
    public IceDecorator(BubbleTea bubbleTea) {
        super(bubbleTea);
    }

    @Override
    public BigDecimal getPrice() {
        return bubbleTea.getPrice().add(BigDecimal.valueOf(0.25));
    }

    @Override
    public String getDescription() {
        return bubbleTea.getDescription() + "+ Ice: 0.25€ ";
    }
}

package Level3.domain.base;

import Level3.domain.model.BubbleTea;

import java.math.BigDecimal;

public class Latte implements BubbleTea{
    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(3.50);
    }

    @Override
    public String getDescription() {
        return "Latte: 3.50";
    }
}

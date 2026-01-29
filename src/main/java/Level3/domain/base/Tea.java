package Level3.domain.base;

import Level3.domain.model.BubbleTea;

import java.math.BigDecimal;

public class Tea implements BubbleTea {
    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(3.00);
    }

    @Override
    public String getDescription() {
        return "Tea: 3.00";
    }
}

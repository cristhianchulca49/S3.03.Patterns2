package Level3.domain.base;

import Level3.domain.model.BubbleTea;

import java.math.BigDecimal;

public class Match implements BubbleTea {
    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(3.20);
    }

    @Override
    public String getDescription() {
        return "Match: ";
    }
}

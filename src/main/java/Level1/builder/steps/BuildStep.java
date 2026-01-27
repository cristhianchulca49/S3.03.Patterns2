package Level1.builder.steps;

import Level1.domain.Menu;

public interface BuildStep {
    BuildStep withDrink(String drink);

    Menu build();
}

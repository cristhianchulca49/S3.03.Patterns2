package Level3.domain.builder;

import Level3.domain.base.Latte;
import Level3.domain.base.Matcha;
import Level3.domain.base.Tea;
import Level3.domain.decorators.FlavorDecorator;
import Level3.domain.decorators.IceDecorator;
import Level3.domain.decorators.SugarDecorator;
import Level3.domain.decorators.TapiocaDecorator;
import Level3.domain.model.BubbleTea;

public class BubbleTeaBuilder {
    private BubbleTea currentTea;


    private BubbleTeaBuilder(BubbleTea base) {
        this.currentTea = base;
    }

    public static BubbleTeaBuilder latte() {
        return new BubbleTeaBuilder(new Latte());
    }

    public static BubbleTeaBuilder matcha() {
        return new BubbleTeaBuilder(new Matcha());
    }

    public static BubbleTeaBuilder tea() {
        return new BubbleTeaBuilder(new Tea());
    }

    public BubbleTeaBuilder withIce() {
        currentTea = new IceDecorator(currentTea);
        return this;
    }

    public BubbleTeaBuilder withSugar() {
        currentTea = new SugarDecorator(currentTea);
        return this;
    }

    public BubbleTeaBuilder withTapioca() {
        currentTea = new TapiocaDecorator(currentTea);
        return this;
    }

    public BubbleTeaBuilder withFlavor(String flavorName) {
        currentTea = new FlavorDecorator(currentTea, flavorName);
        return this;
    }

    public BubbleTea build() {
        return currentTea;
    }
}
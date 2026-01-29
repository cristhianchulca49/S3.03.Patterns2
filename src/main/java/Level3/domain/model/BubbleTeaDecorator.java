package Level3.domain.model;

public abstract class BubbleTeaDecorator implements BubbleTea {
    protected final BubbleTea bubbleTea;

    protected BubbleTeaDecorator(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }
}


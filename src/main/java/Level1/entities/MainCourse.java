package Level1.entities;

public class MainCourse extends Dish {
    private String extraSide;

    public MainCourse(String name) {
        super(name);
    }

    public void setExtraSide(String extraSide) {
        this.extraSide = extraSide;
    }
}

package Level1.domain.entities;

public class MainCourse extends Dish {
    private String supplement;

    public MainCourse(String name) {
        super(name);
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }
}

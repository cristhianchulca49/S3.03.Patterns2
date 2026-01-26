package Level1.builder;

import Level1.builder.steps.EntrantConfigStep;
import Level1.builder.steps.MainCourseConfigStep;
import Level1.builder.steps.StarStep;
import Level1.domain.Menu;
import Level1.entities.Dish;
import Level1.entities.Entrant;
import Level1.entities.MainCourse;

public class MenuBuilder implements StarStep, EntrantConfigStep, MainCourseConfigStep {
    private Menu menu;
    private Dish currentDish;


    @Override
    public EntrantConfigStep withEntrant(String name) {
        currentDish = new Entrant(name);
        menu.setEntrant(currentDish);
        return this;
    }

    @Override
    public EntrantConfigStep isVegan() {
        currentDish.setVegan();
        return this;
    }

    @Override
    public EntrantConfigStep isGlutenFree() {
        currentDish.setGlutenFree();
        return this;
    }

    @Override
    public MainCourseConfigStep withMainCourse(String name) {
        currentDish = new MainCourse(name);
        menu.setMainCourse(currentDish);
        return this;
    }
}

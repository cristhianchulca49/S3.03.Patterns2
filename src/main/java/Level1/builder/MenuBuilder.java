package Level1.builder;

import Level1.builder.steps.BuildStep;
import Level1.builder.steps.EntrantConfig;
import Level1.builder.steps.MainCourseConfig;
import Level1.builder.steps.StartStep;
import Level1.domain.Menu;
import Level1.domain.entities.Complement;
import Level1.domain.entities.Dish;
import Level1.domain.entities.Entrant;
import Level1.domain.entities.MainCourse;

public class MenuBuilder implements StartStep, EntrantConfig, MainCourseConfig, BuildStep {
    private Dish currentDish;

    private Dish entrant;
    private MainCourse mainCourse;
    private Dish complement;
    private String drink;


    @Override
    public MenuBuilder isVegan() {
        this.currentDish.setVegan();

        return this;
    }

    @Override
    public MenuBuilder isGlutenFree() {
        this.currentDish.setGlutenFree();
        return this;
    }


    @Override
    public EntrantConfig withEntrant(String name) {
        this.entrant = new Entrant(name);
        this.currentDish = this.entrant;
        return this;
    }

    @Override
    public MainCourseConfig withMainCourse(String name) {
        this.mainCourse = new MainCourse(name);
        this.currentDish = this.mainCourse;
        return this;
    }

    @Override
    public MainCourseConfig withSupplement(String supplement) {
        this.mainCourse.setSupplement(supplement);
        return this;
    }

    @Override
    public BuildStep withCoffee(String coffee) {
        this.complement = new Complement(coffee);
        return this;
    }

    @Override
    public BuildStep withDessert(String dessert) {
        this.complement = new Complement(dessert);
        return this;
    }

    @Override
    public BuildStep withDrink(String drink) {
        this.drink = drink;
        return this;
    }

    @Override
    public Menu build() {
        return new Menu(entrant, mainCourse, complement, drink);
    }
}
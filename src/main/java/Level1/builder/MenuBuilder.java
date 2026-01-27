package Level1.builder;

import Level1.builder.steps.*;
import Level1.domain.Menu;
import Level1.domain.entities.Complement;
import Level1.domain.entities.Dish;
import Level1.domain.entities.Entrant;
import Level1.domain.entities.MainCourse;

public class MenuBuilder implements StartStep, EntrantConfig, MainCourseConfig, BuildStep {

    private Dish entrant;
    private MainCourse mainCourse;
    private Dish complement;
    private String drink;

    @Override
    public EntrantConfig withEntrant(String name) {
        this.entrant = new Entrant(name);
        return this;
    }

    @Override
    public EntrantConfig isEntrantVegan() {
        this.entrant.setVegan();
        return this;
    }

    @Override
    public EntrantConfig isEntrantGlutenFree() {
        this.entrant.setGlutenFree();
        return this;
    }

    @Override
    public MainCourseConfig withMainCourse(String name) {
        this.mainCourse = new MainCourse(name);
        return this;
    }

    @Override
    public MainCourseConfig isMainVegan() {
        this.mainCourse.setVegan();
        return this;
    }

    @Override
    public MainCourseConfig isMainGlutenFree() {
        this.mainCourse.setGlutenFree();
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
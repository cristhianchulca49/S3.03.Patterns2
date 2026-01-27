package Level1.builder.steps;

import Level1.Main;

public interface MainCourseConfig extends BuildStep {
    MainCourseConfig isMainVegan();
    MainCourseConfig isMainGlutenFree();
    MainCourseConfig withSupplement(String supplement);
    BuildStep withDessert(String dessert);
    BuildStep withCoffee(String coffee);
}
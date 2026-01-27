package Level1.builder.steps;

public interface MainCourseConfig extends BuildStep {
    MainCourseConfig isVegan();
    MainCourseConfig isGlutenFree();
    MainCourseConfig withSupplement(String supplement);
    BuildStep withDessert(String dessert);
    BuildStep withCoffee(String coffee);
}
package Level1.builder.steps;

public interface EntrantConfig {
    EntrantConfig isVegan();
    EntrantConfig isGlutenFree();
    MainCourseConfig withMainCourse(String name);
}

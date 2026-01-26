package Level1.builder.steps;

public interface EntrantConfigStep {
    EntrantConfigStep isVegan();
    EntrantConfigStep isGlutenFree();
    MainCourseConfigStep withMainCourse(String name);
}

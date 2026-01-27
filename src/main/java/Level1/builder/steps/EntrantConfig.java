package Level1.builder.steps;

public interface EntrantConfig {
    EntrantConfig isEntrantVegan();
    EntrantConfig isEntrantGlutenFree();
    MainCourseConfig withMainCourse(String name);
}

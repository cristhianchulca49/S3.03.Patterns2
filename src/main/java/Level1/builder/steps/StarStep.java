package Level1.builder.steps;

public interface StarStep {
    EntrantConfigStep withEntrant(String name);
    MainCourseConfigStep withMainCourse(String name);
}

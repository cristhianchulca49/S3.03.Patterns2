package Level1.domain;

import Level1.domain.entities.Dish;


public class Menu {
    private Dish entrant;
    private Dish mainCourse;
    private Dish complement;
    private String drink;

    public Menu(Dish entrant, Dish mainCourse, Dish complement, String drink) {
        this.entrant = entrant;
        this.mainCourse = mainCourse;
        this.complement = complement;
        this.drink = drink;
    }
}

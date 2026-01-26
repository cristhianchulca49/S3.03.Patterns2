package Level1.domain;

import Level1.entities.Dish;


public class Menu {
    private Dish entrant;
    private Dish mainCourse;
    private Dish complement;
    private String drink;

    Menu() {
    }

    public void setEntrant(Dish entrant) {
        this.entrant = entrant;
    }

    public void setMainCourse(Dish mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setComplements(Dish complement) {
        this.complement = complement;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}

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

    @Override
    public String toString() {
        return String.format(
                """
                        --- MENU ORDER ---
                        1. Entrant: %s
                        2. Main:    %s
                        3. Complement:  %s
                        4. Drink:   %s
                        ------------------""",
                this.entrant != null ? this.entrant : "None",
                this.mainCourse != null ? this.mainCourse : "None",
                this.complement != null ? this.complement : "None",
                this.drink != null ? this.drink : "No drink"
        );
    }
}

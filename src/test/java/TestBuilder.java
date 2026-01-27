import Level1.builder.MenuBuilder;
import Level1.domain.Menu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBuilder {
    @Test
    public void testExecutiveMenuBuilder() {
        Menu executiveMenu = new MenuBuilder()
                .withEntrant("Amanida Mediterrània")
                .isEntrantVegan()
                .isEntrantGlutenFree()
                .withMainCourse("Filet de Vedella")
                .isMainVegan()
                .isMainGlutenFree()
                .withSupplement("Guarnició extra")
                .withDessert("Mousse de xocolata")
                .withDrink("Vi Negre")
                .build();

        String expected =
                "--- MENU ORDER ---\n" +
                        "1. Entrant: Amanida Mediterrània (Vegan) (GlutenFree)\n" +
                        "2. Main:    Filet de Vedella (Vegan) (GlutenFree), Supplement: Guarnició extra\n" +
                        "3. Complement:  Mousse de xocolata\n" +
                        "4. Drink:   Vi Negre\n" +
                        "------------------";

        assertEquals(expected, executiveMenu.toString());
    }

    @Test
    public void testHalfMenuBuilder() {
        Menu halfMenu = new MenuBuilder()
                .withMainCourse("Risotto de bolets")
                .isMainVegan()
                .withDrink("Aigua")
                .build();

        String expected =
                "--- MENU ORDER ---\n" +
                        "1. Entrant: None\n" +
                        "2. Main:    Risotto de bolets (Vegan)\n" +
                        "3. Complement:  None\n" +
                        "4. Drink:   Aigua\n" +
                        "------------------";

        assertEquals(expected, halfMenu.toString());

    }

    @Test

    public void testKidsMenuBuilder() {
        Menu kidsMenu = new MenuBuilder()
                .withMainCourse("Macarrons amb tomàquet")
                .withDessert("Gelat de Vainilla")
                .withDrink("Suc de taronja")
                .build();

        String expected =
                "--- MENU ORDER ---\n" +
                        "1. Entrant: None\n" +
                        "2. Main:    Macarrons amb tomàquet\n" +
                        "3. Complement:  Gelat de Vainilla\n" +
                        "4. Drink:   Suc de taronja\n" +
                        "------------------";

        assertEquals(expected, kidsMenu.toString());
    }
}
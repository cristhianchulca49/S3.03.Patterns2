package Level1.entities;

public class Dish {
    private String name;
    private boolean vegan;
    private boolean glutenFree;

    public Dish(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVegan() {
        this.vegan = true;
    }

    public void setGlutenFree() {
        this.glutenFree = true;
    }
}

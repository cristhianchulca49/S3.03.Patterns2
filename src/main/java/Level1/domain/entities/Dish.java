package Level1.domain.entities;

public abstract class Dish {
    private String name;
    private boolean vegan;
    private boolean glutenFree;

    public Dish(String name) {
        this.name = name;
    }

    public void setVegan() {
        this.vegan = true;
    }

    public void setGlutenFree() {
        this.glutenFree = true;
    }
}

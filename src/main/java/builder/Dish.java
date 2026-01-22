package builder;

public class Dish {
    String name;
    boolean vegan;
    boolean glutenFree;

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

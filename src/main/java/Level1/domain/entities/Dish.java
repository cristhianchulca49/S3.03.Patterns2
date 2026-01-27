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

    @Override
    public String toString() {
        return String.format("%s%s%s",
                this.name,
                this.vegan ? " (Vegan)" : "",
                this.glutenFree ? " (GlutenFree)" : ""
        );
    }
}

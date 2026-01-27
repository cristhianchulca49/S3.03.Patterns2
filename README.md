# 🍽️ Exercise: Restaurant Menu Builder Pattern

## 🎯 Objective
Design and implement a system to construct different types of restaurant menus by applying the **Builder Design Pattern** with a **Fluent Builder** style, following **SOLID** principles.

Additionally, this exercise utilizes the concept of a **Progressive Interface** (or Step Builder). This technique progressively limits the options available to the user during object construction, ensuring the process follows a correct logical order and satisfies all step dependencies.

**Examples of constraints:**
* Desserts cannot be added before a main course.
* The method to add desserts cannot be called more than once.

---

## 🍽️ Description
Menus can be composed of the following components:
* **Entrant** (Appetizer)
* **Main Course**
* **Dessert or Coffee**
* **Drink**

### Dish Characteristics:
* **Dietary Preferences:** Any dish can be marked as **Vegan** and/or **Gluten-Free**.
* **Main Course Extras:** The main course can include a **Supplement** (e.g., an extra side dish).

### Menu Variations:
* **Half Menu:** Includes only a Main Course + Drink.
* **Kids Menu:** Includes only a Main Course + Dessert + Drink.
* **Drink Policy:** Menus can be ordered without a drink.
* **Finish Options:** Desserts/Coffee are optional. Users must choose *either* a dessert *or* a coffee, but not both.

---

## 📌 Requirements

1.  **Flexible Step-by-Step Construction:** Model a system that guarantees a mandatory and correct order without depending on concrete classes. 
    * *Rule:* You cannot add desserts before the main course.
2.  **Exclusive Selection Rule:**
    * If a **Dessert** is chosen, **Coffee** cannot be added.
    * If **Coffee** is chosen, **Dessert** cannot be added.
    * *Constraint:* This rule must be guaranteed by **Interface Design**, not by runtime validation (if/else).
3.  **Expressive Configuration:** Allow configuring dish properties (vegan, gluten-free, supplements) using fluid and expressive methods, avoiding the use of boolean parameters.
4.  **Unit Testing:** Implement tests demonstrating the creation of various menus (Complete, Vegan, Half-menu, etc.).

---

## 🧪 Expected Usage Examples

### Executive Menu (Complete)
```java
Menu executiveMenu = new MenuBuilder()
    .withEntrant("Mediterranean Salad")
        .isVegan()
        .isGlutenFree()
    .withMainCourse("Beef Fillet")
        .withSupplement("Extra Side")
    .withDessert("Chocolate Mousse")
    .withDrink("Red Wine")
    .build();

    Menu kidsMenu = new MenuBuilder()
    .withMainCourse("Macaroni with Tomato")
    .withDessert("Vanilla Ice Cream")
    .withDrink("Orange Juice")
    .build();

    Menu halfMenu = new MenuBuilder()
    .withMainCourse("Mushroom Risotto")
        .isVegan()
    .withCoffee("Espresso")
    .withDrink("Water")
    .build();
```

---

### 🧪 Tools & Technologies Used

- **Java 17/21** – Core programming language.
- **JUnit 5** – Testing framework for unit and parameterized tests.
- **Maven/Gradle** – Dependency management and project build.
- **Git & GitHub** – Version control and project sharing.
- **IntelliJ IDEA** – Primary IDE for development.

---

## 🛠️ Installation

Clone this repository:
```git
git clone https://github.com/cristhianchulca49/S3.03.Patterns2.git
```
---

## 🤝 Contributions are welcome! 
Please follow these steps to contribute:
  
- Fork the repository Create a new branch: git checkout -b feature/NewFeature 
- Make your changes and commit them: git commit -m 'Add New Feature' 
- Push the changes to your branch: git push origin feature/NewFeature 
- Open a Pull Request
    

package ru.job4j.oop.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {

    @Override
    public String name() {
        return super.name() + " and tomato";
    }
}

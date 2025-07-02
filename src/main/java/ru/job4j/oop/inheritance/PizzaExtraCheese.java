package ru.job4j.oop.inheritance;

public class PizzaExtraCheese extends Pizza {

    @Override
    public String name() {
        return super.name() + " with cheese";
    }
}

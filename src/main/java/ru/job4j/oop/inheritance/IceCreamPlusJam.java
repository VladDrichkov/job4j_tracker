package ru.job4j.oop.inheritance;

public class IceCreamPlusJam extends IceCream {
    public static final int JAM_PRICE = 50;

    public IceCreamPlusJam(int weight) {
        super(weight);
    }

    @Override
    public int price() {
        return JAM_PRICE + super.price();
    }
}

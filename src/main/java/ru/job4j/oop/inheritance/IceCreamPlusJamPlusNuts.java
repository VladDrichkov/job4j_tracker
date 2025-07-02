package ru.job4j.oop.inheritance;

public class IceCreamPlusJamPlusNuts extends IceCreamPlusJam {
    public static final int NUT_PRICE = 25;

    public IceCreamPlusJamPlusNuts(int weight) {
        super(weight);
    }

    @Override
    public int price() {
        return NUT_PRICE + super.price();
    }

    public static void main(String[] args) {
        IceCreamPlusJamPlusNuts iceCream = new IceCreamPlusJamPlusNuts(4);
        System.out.println(iceCream.price());
    }
}

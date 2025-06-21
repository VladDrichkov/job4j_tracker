package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (1 == position) {
            System.out.println("Пусть бегут неуклюже");
        } else if (2 == position) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox childCollections = new Jukebox();
        childCollections.music(1);
    }
}

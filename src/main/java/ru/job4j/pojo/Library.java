package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {

        Book[] books = {new Book("Head First Java: A Brain-Friendly Guide", 752),
                new Book("Effective Java", 416),
                new Book("Core Java: Fundamentals, Volume 1", 944),
                new Book("Clean Code", 464)};

        printBooks(books);
        System.out.println("=================================================");
        Book b = books[0];
        books[0] = books[3];
        books[3] = b;
        printBooks(books);
        System.out.println("=================================================");

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean Code")) {
                System.out.printf("\"%s\"; %d pages%n",
                        books[i].getName(), books[i].getNumberOfPages());
            }
        }
    }

    private static void printBooks(Book[] books) {
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            System.out.printf("\"%s\"; %d pages%n",
                    books[i].getName(), books[i].getNumberOfPages());
        }
        System.out.println();
    }
}

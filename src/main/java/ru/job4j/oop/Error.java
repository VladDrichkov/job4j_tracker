package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("active: " + active);
        System.out.println("status: " + status);
        System.out.println("message: " + message);
    }

    public static void main(String[] args) {
        Error err1 = new Error();
        err1.printInfo();
        Error err2 = new Error(true, 1, "error2");
        err2.printInfo();
        Error err3 = new Error(false, 2, "error3");
        err3.printInfo();
        Error err4 = new Error(true, 10, "error4");
        err4.printInfo();
    }
}

package ru.job4j.pojo;

import java.time.LocalDate;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Ivanov");
        student.setName("Alexey");
        student.setPatronymic("Petrovich");
        student.setStudyGroup("25-PF-1");
        student.setDateOfReceipt(LocalDate.of(2025, 4, 15));

        System.out.println(student.getSurname());
        System.out.println(student.getName());
        System.out.println(student.getPatronymic());
        System.out.println(student.getStudyGroup());
        System.out.println(student.getDateOfReceipt());
    }
}

package ru.job4j.oop.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        /*TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        */

        JSONReport report = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}

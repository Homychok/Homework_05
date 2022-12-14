import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        homework1();
        homework2();
        homework3();
        homework4();
        homework5();
        homework6();
        homework7();
    }
    public static void homework1() {
        System.out.println("Домашняя задача 1");
        {
            String firstName = "Ivanov";
            String middleName = "Ivan";
            String lastName = "Ivanovich";
            String fullName = firstName + " " + middleName + " " + lastName;
            System.out.println("ФИО сотрудника — " + fullName);
        }
    }
    public static void homework2() {
        System.out.println("Домашняя задача 2");
        {
            String firstName = "Ivanov";
            String middleName = "Ivan";
            String lastName = "Ivanovich";
            String fullName = firstName + " " + middleName + " " + lastName;
            System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        }
    }
    public static void homework3() {
        System.out.println("Домашняя задача 3");
        {
            String fullName = "Иванов Семён Семёнович";
            fullName = fullName.replace("ё", "е");
            System.out.println("Данные ФИО сотрудника — " + fullName);
        }
    }
    public static void homework4() {
        System.out.println("Домашняя задача 4");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = scanner.next();
            System.out.println("Hello, " + name + "!");
        }
    }
    public static void homework5() {
        System.out.println("Домашняя задача 5");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter temperature");
            String temperature = scanner.next();

            System.out.println("Температура воздуха сегодня: " + temperature + " градусов.");
        }
    }
    public static void homework6() {
        System.out.println("Домашняя задача 6");
        String month;
        Scanner scanner;
        {
            scanner = new Scanner(System.in);
            System.out.println("Enter the day today");
            String day = scanner.next();
            if (day.length() == 1) {
                day = '0' + day;
            } else if (day.length() > 2) {
                throw new RuntimeException("Некорректная дата");
            }
            System.out.println("Enter the month today");
            month = scanner.next();
            if (month.length() == 1) {
            month = '0' + month;
            } else if (month.length() > 2) {
            throw new RuntimeException("Некорректная дата");
            }
            System.out.println("Enter the year today");
            String year = scanner.next();
            if (year.length() == 1) {
            year = "0" + year;
            } else if (year.length() == 2) {
                year = "0" + "0" + year;
            } else if (year.length() == 3) {
                year = "0" + "0" + "0"  + year;
            } else if (year.length() > 4) {
            throw new RuntimeException("Некорректная дата");
            }
            System.out.println(day + ":" + month + ":" + year);
        }
    }
    public static void homework7() {
        System.out.println("Домашняя задача 7");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("Enter your number of messages");
            String messages = scanner.nextLine();
            System.out.println("Привет, " + name + "! Это твой помощник Майкл. У тебя " + messages + " новых писем.");
        }
    }
}
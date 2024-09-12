package org.example;

import org.example.task2.*;
import org.example.task2hard.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ класс Book + интерфейс:");
        BookTask1 bookTask1 = new BookTask1();
        bookTask1.setBookName("Good Omens");
        bookTask1.setAuthor("Terry Pratchett");
        bookTask1.setYear("1990");
        bookTask1.display();
        System.out.println();

        System.out.println("Класс Student + Интерфейс:");
        StudentTask1 studentTask1 = new StudentTask1();
        studentTask1.setName("Ivan");
        studentTask1.setSurname("Ivanoff");
        studentTask1.setRecordBookNumber(12545);
        studentTask1.setAverageScore(4.55);
        studentTask1.print();
        System.out.println();

        System.out.println("Класс Point + Интерфейс:");
        Point point = new Point();
        point.setX(1);
        point.setY(5);
        point.coordinates();
        point.moveDown();
        point.moveUp();
        point.moveLeft();
        point.moveRight();
        System.out.println();

        System.out.println("Класс Clock + интерфейс");
        Clock clock = new Clock();
        clock.setHours(20);
        clock.setMinutes(59);
        clock.setSeconds(59);
        System.out.println("Current time:");
        clock.readTime();
        System.out.println("Increase time on 1 sec:");
        clock.tick();
        clock.readTime();
        System.out.println("Increase time on 1 sec:");
        clock.tick();
        clock.readTime();
        System.out.println();

        System.out.println("Класс Car + интерфейс");
        Car car = new Car();
        car.start();
        car.stop();
        car.drive(1000);
        System.out.println();

        System.out.println("Вторая часть ДЗ, усложненное:\n");
        System.out.println("Задача про студентов и Менеджера студентов");
        Student student1 = new Student();
        student1.setName("Ivan");
        student1.setSurname("Petroff");
        student1.setId("12548854");

        Student student2 = new Student();
        student2.setName("John");
        student2.setSurname("Smith");
        student2.setId("2564875524");

        StudentManager students = new StudentManager();
        System.out.println("Добавили студентов, выводим список: ");
        students.addStudent(student1);
        students.addStudent(student2);
        students.printAllStudents();
        System.out.println();
        System.out.println("Удалили студента, обновленный список:");
        students.removeStudentById("2564875524");
        students.printAllStudents();
        System.out.println();

        System.out.println("Задача про книги и уникальный набор книг");
        Book book1 = new Book("Small GODS", "Terry Pratchett");
        Book book2 = new Book("The Hitchhiker's Guide to the Galaxy", "Duglas Adams");
        Book book3 = new Book("The Hitchhiker's Guide to the Galaxy", "Duglas Adams");
        BookCollection collection = new BookCollection();
        System.out.println("Добавили книги в набор: ");
        collection.addBook(book1);
        collection.addBook(book2);
        collection.printCollection();
        System.out.println("Проверяем, если ли книга в наборе: ");
        collection.isBookContains(book1);
        System.out.println("Удаляем книгу из набора и проверяем, есть ли она в наборе:");
        collection.removeBook(book1);
        collection.isBookContains(book1);
        System.out.println();

        System.out.println("Задача про Продукты и цены\n");
        Product product = new Product("Tomato", 255.25);
        Product product1 = new Product("Potato", 122.5);
        PriceList priceList = new PriceList();
        priceList.addProduct(product);
        priceList.addProduct(product1);
        System.out.println("Добавили в прайс продукты с ценами, проверяем цену Tomato:");
        priceList.getPriceByProductName("Tomato");
        System.out.println("Распечатаем весь список товаров и цен:");
        priceList.printAllProducts();
        System.out.println("Изменим цену одного товара и распечатаем список:");
        priceList.changePrice("Tomato", 600);
        priceList.printAllProducts();
        System.out.println();

        System.out.println("Задача про отростированные таски");
        Task task = new Task("Wright test documentation on new feature", 10);
        Task task1 = new Task("Checklist for smoke testing", 4);
        Task task2 = new Task("Env for demo", 5);
        Task task4 = new Task("Release, check all stories", 15);

        TaskManager taskList = new TaskManager();
        taskList.addTask(task);
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task4);
        System.out.println("После добавления задач, отсортируем по приоритету (по возрастанию приоритета):");
        taskList.sortedList();
        System.out.println("Удаляем задачу");
        taskList.removeTask("Release, check all stories");
        System.out.println("Task list after removing:");
        taskList.sortedList();
        System.out.println();

        System.out.println("Задача про музыкальные треки");
        MusicLibrary library = new MusicLibrary();

        MusicTrack track1 = new MusicTrack("Song1", "Artist1", "Rock");
        MusicTrack track2 = new MusicTrack("Song2", "Artist2", "Pop");
        MusicTrack track3 = new MusicTrack("Song3", "Artist1", "Rock");

        library.addTrack(track1);
        library.addTrack(track2);
        library.addTrack(track3);
        library.printAllTracksByGenre("Rock");
        System.out.println();
        library.removeTrack(track3);
        System.out.println("Library after removing one track:");
        library.printAllTracksByGenre("Rock");




    }





}
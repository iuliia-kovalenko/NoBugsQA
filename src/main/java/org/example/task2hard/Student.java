package org.example.task2hard;

public class Student {
    private String name;

//    public Student(String name, String surname, String id) {
//        this.name = name;
//        this.surname = surname;
//        this.id = id;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String surname;
    private String id;

    public void print() {
        System.out.println("Name: " + this.name + ", Surname: " + surname + ", ID: " + this.id);
    }
}

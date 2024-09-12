package org.example.task2;

import org.example.task1.Printable;

public class StudentTask1 implements Printable {
    private String name;
    private String surname;
    private int recordBookNumber;
    private double averageScore;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRecordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getRecordBookNumber() {
        return recordBookNumber;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public void print() {
        System.out.println("Student: " + this.name + " " + this.surname +
        ", Record book number: " + this.recordBookNumber + ", average score: " + this.averageScore);
    }

}

package org.example.task2;

public class BookTask1 implements Displayable{
     private String author;
     private String year;
     private String bookName;

    public BookTask1(String author, String year, String bookName) {
        this.author = author;
        this.year = year;
        this.bookName = bookName;
    }

    public BookTask1() {};

    public void setAuthor(String author) {
     this.author = author;
     }

     public String getAuthor() {
         return this.author = author;
     }

     public void setYear(String year) {
         this.year  =year;
     }

     public String getYear() {
         return this.year = year;
     }

     public void setBookName(String bookName) {
         this.bookName = bookName;
     }

     public String getBookName() {
         return this.bookName = bookName;
     }

    @Override
    public void display() {
        System.out.println("The name of the book: " + this.bookName + ", the author: "
                + this.author + ", year of publication: " + this.year);
    }
}

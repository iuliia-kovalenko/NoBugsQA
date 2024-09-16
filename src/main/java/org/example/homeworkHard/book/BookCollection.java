package org.example.homeworkHard.book;

import java.util.HashSet;

public class BookCollection {
    private HashSet<Book> bookCollection;


    public BookCollection () {
        this.bookCollection = new HashSet<Book>();
    }

    public void addBook(Book book) {
        this.bookCollection.add(book);
    }

    public void printCollection() {
        for(Book book: bookCollection) {
            book.print();
        }
    }

    public void isBookContains(Book book) {
         if (bookCollection.contains(book)) {
             System.out.println("Book Collection contains book");
         } else {
             System.out.println("Book Collection does not contain this book");
         }
    }

    public void removeBook(Book book) {
        bookCollection.remove(book);
    }




}

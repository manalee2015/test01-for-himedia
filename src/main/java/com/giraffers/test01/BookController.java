package com.giraffers.level03.hard;

public class BookController {

    Library library = new Library();

    public void addBook() {
        library.addBook();
    }

    public void getBook() {
        library.getBook();
    }

    public void updateBook() {
        library.updateBook();
    }

    public void deleteBook() {
        library.deleteBook();
    }
}

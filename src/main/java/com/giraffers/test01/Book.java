package com.giraffers.level03.hard;

public class Book {

    private String title;
    private String author;
    private int isbn;
    private boolean isForeignBook;

    public Book() {
    }

    public Book(String author, String title, int isbn, boolean isForeignBook) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.isForeignBook = isForeignBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isForeignBook() {
        return isForeignBook;
    }

    public void setForeignBook(boolean foreignBook) {
        isForeignBook = foreignBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", isForeignBook=" + isForeignBook +
                '}';
    }
}

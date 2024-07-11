package com.giraffers.level03.hard;

import java.util.ArrayList;
import java.util.List;

public class BookView {

    Library library = new Library();

    public void displayBook() {}

    public void displayBooks(List<Book> books) {

        if (books.isEmpty()) {

            System.out.println("-----------------------");
            System.out.println("등록된 도서가 없습니다.");
            System.out.println("-----------------------");

        } else {

            for (Book book : books) {
                System.out.println(book);
            }

        }

    }

    public void displayMessage() {}
}

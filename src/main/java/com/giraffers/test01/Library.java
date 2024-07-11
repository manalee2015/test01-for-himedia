package com.giraffers.level03.hard;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    List<Book> books = new ArrayList<>();

    public void addBook() {

        Book book = new Book();
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("[Ready] 새로운 도서를 등록하겠습니다.");
        System.out.println("-------------------------------------");


        System.out.print("도서 제목을 입력해 주십시오: ");
        book.setTitle(sc.nextLine());

        System.out.println("-------------------------------------");
        System.out.print("도서 저자를 입력해 주십시오: ");
        book.setAuthor(sc.nextLine());

        System.out.println("-------------------------------------");
        System.out.print("도서 ISBN을 입력해 주십시오: ");
        book.setIsbn(sc.nextInt());
        sc.nextLine();

        System.out.println("--------------------------------------");
        System.out.println("해외도서: True, 국내도서: False");
        System.out.print("해외도서 여부를 입력해 주십시오: ");
        book.setForeignBook(sc.nextBoolean());

        books.add(book);

        System.out.println("book = " + book);

    }

    public void getBook() {

        Scanner scanner = new Scanner(System.in);

        if (books.isEmpty()) {
            System.out.println("----------------------------");
            System.out.println("현재 동록된 도서가 없습니다.");
            System.out.println("----------------------------");
        } else {
            System.out.println("----------------------------");
            System.out.println("ISBN 번호를 입력해 주십시오");
            int isbn = scanner.nextInt();

            for (Book book : books) {
                if (book.getIsbn() == isbn) {
                    System.out.println(book);
                }
            }
        }

    }

    public void updateBook() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.print("ISBN 번호를 입력해 주십시오: ");
        int isbn = scanner.nextInt();
        scanner.nextLine();

        System.out.println("---------------------------");
        System.out.println("1. 제목 수정하기");
        System.out.println("2. 저자 수정하기");
        System.out.println("3. 해외서적 여부 수정하기");
        System.out.print("수정항목을 선택해 주십시오: ");
        int number = scanner.nextInt();

        System.out.println("-----------------------------");
        System.out.print("수정할 내용을 입력해 주십시오: ");

        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                switch (number) {
                    case 1: book.setTitle(scanner.nextLine()); break;
                    case 2: book.setAuthor(scanner.nextLine()); break;
                    case 3: book.setForeignBook(scanner.nextBoolean()); break;
                    default: break;
                }
            }
        }

    }

    public void deleteBook() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.print("ISBN 번호를 입력해 주십시오: ");
        int isbn = scanner.nextInt();

        books.removeIf(book -> book.getIsbn() == isbn);
    }
}

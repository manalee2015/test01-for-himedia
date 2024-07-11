package com.giraffers.level03.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.giraffers.level03.hard.Library.*;

public class Application {

    public static void main(String[] args) {

        BookController bookController = new BookController();

        BookView bookView = new BookView();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 조회");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 전체 보기");
            System.out.println("9. 프록그램 종료");

            System.out.println("------------------------------");
            System.out.print("필요한 기능을 입력하십시오: ");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    bookController.addBook();
                    System.out.println("성공적으로 추가되었습니다.");
                    break;
                case 2: bookController.getBook(); break;
                case 3: bookController.updateBook(); break;
                case 4: bookController.deleteBook(); break;
                case 5: bookView.displayBooks(bookController.library.books); break;
                case 9:
                    System.out.println("------------------------------");
                    System.out.println("[BYE] 프로그램 종료합니다 [BYE]");
                    System.out.println("------------------------------");
                    return;
                default:
                    System.out.println("------------------------------");
                    System.out.println(" [Again] 잘못 입력하였습니다. ");
                    System.out.println("------------------------------");
                    break;
            }

        }

    }

}

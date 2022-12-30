package com.example.bookexam;

import com.example.io.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BookUI {
    private BufferedReader br;

    public BookUI() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int menu() {
        System.out.println("1. 책 등록");
        System.out.println("2. 책 목록 보기");
        System.out.println("3. 책 수정");
        System.out.println("4. 책 삭제");
        System.out.println("5. 프로그램 종료");

        String line = "";
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(line);
    }

    public Book regBook() {
        try {
            System.out.print("title 입력: ");
            String title = br.readLine();
            System.out.print("writer 입력: ");
            String writer = br.readLine();
            System.out.print("genre 입력: ");
            String genre = br.readLine();
            System.out.print("publisher 입력: ");
            String publisher = br.readLine();

            Book book = new Book(title, writer, genre, publisher);
            return book;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String inputTitle() {
        try {
            System.out.println("책의 Title을 입력하세요.");
            String title = br.readLine();

            return title;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void bookList(List<Book> books) {
        System.out.println("Title           Writer          Genre           Publisher");
        System.out.println("=====================================================================");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.print(book.getTitle());
            System.out.print("            ");
            System.out.print(book.getWriter());
            System.out.print("            ");
            System.out.print(book.getGenre());
            System.out.print("            ");
            System.out.print(book.getPublisher());
            System.out.print("            ");
            System.out.println();
        }
    }
}

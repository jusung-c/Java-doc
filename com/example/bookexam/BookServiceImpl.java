package com.example.bookexam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    List<Book> books;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public BookServiceImpl() {
        this.books = new ArrayList<>();
    }

    public BookServiceImpl(List<Book> books) {
        this.books = books;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void updateBook(String title) {
        int findIndex = exist(title);

        if (findIndex > -1) {
            Book book = books.get(findIndex);
            books.remove(book);

            try {
                System.out.println("수정할 책의 writer 입력");
                String updateWriter = br.readLine();
                System.out.println("수정할 책의 genre 입력");
                String updateGenre = br.readLine();
                System.out.println("수정할 책의 publisher 입력");
                String updatePublisher = br.readLine();

                books.add(new Book(book.getTitle(), updateWriter, updateGenre, updatePublisher));

                System.out.println("수정이 완료되었습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("존재하지 않는 Book입니다.");
        }
    }

    @Override
    public void deleteBook(String title) {
        int findIndex = exist(title);

        if (findIndex > -1) {
            books.remove(findIndex);
            System.out.println("삭제가 완료되었습니다.");
        } else {
            System.out.println("존재하지 않는 Book입니다.");
        }
    }

    @Override
    public List<Book> bookList() {
        return books;
    }

    @Override
    public int exist(String title) {
        int findIndex = -1;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                findIndex = i;
            }
        }
        return findIndex;
    }
}

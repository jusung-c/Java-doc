package com.example.bookexam;

import java.util.List;

public interface BookService {
    public void addBook(Book book);

    public void updateBook(String title);

    public void deleteBook(String title);

    public List<Book> bookList();

    public int exist(String title);
}

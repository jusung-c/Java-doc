package com.example.bookexam;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String writer;
    private String genre;
    private String publisher;

    public Book(String title, String writer, String genre, String publisher) {
        this.title = title;
        this.writer = writer;
        this.genre = genre;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
